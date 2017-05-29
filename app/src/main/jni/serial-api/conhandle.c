/* © 2014 Sigma Designs, Inc. This is an unpublished work protected by Sigma
 * Designs, Inc. as a trade secret, and is not to be used or disclosed except as
 * provided Z-Wave Controller Development Kit Limited License Agreement. All
 * rights reserved.
 *
 * Notice: All information contained herein is confidential and/or proprietary to
 * Sigma Designs and may be covered by U.S. and Foreign Patents, patents in
 * process, and are protected by trade secret or copyright law. Dissemination or
 * reproduction of the source code contained herein is expressly forbidden to
 * anyone except Licensees of Sigma Designs  who have executed a Sigma Designs’
 * Z-WAVE CONTROLLER DEVELOPMENT KIT LIMITED LICENSE AGREEMENT. The copyright
 * notice above is not evidence of any actual or intended publication of the
 * source code. THE RECEIPT OR POSSESSION OF  THIS SOURCE CODE AND/OR RELATED
 * INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS  TO REPRODUCE, DISCLOSE OR
 * DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL A PRODUCT THAT IT  MAY
 * DESCRIBE.
 *
 * THE SIGMA PROGRAM AND ANY RELATED DOCUMENTATION OR TOOLS IS PROVIDED TO COMPANY
 * "AS IS" AND "WITH ALL FAULTS", WITHOUT WARRANTY OF ANY KIND FROM SIGMA. COMPANY
 * ASSUMES ALL RISKS THAT LICENSED MATERIALS ARE SUITABLE OR ACCURATE FOR
 * COMPANY’S NEEDS AND COMPANY’S USE OF THE SIGMA PROGRAM IS AT COMPANY’S
 * OWN DISCRETION AND RISK. SIGMA DOES NOT GUARANTEE THAT THE USE OF THE SIGMA
 * PROGRAM IN A THIRD PARTY SERVICE ENVIRONMENT OR CLOUD SERVICES ENVIRONMENT WILL
 * BE: (A) PERFORMED ERROR-FREE OR UNINTERRUPTED; (B) THAT SIGMA WILL CORRECT ANY
 * THIRD PARTY SERVICE ENVIRONMENT OR CLOUD SERVICE ENVIRONMENT ERRORS; (C) THE
 * THIRD PARTY SERVICE ENVIRONMENT OR CLOUD SERVICE ENVIRONMENT WILL OPERATE IN
 * COMBINATION WITH COMPANY’S CONTENT OR COMPANY APPLICATIONS THAT UTILIZE THE
 * SIGMA PROGRAM; (D) OR WITH ANY OTHER HARDWARE, SOFTWARE, SYSTEMS, SERVICES OR
 * DATA NOT PROVIDED BY SIGMA. COMPANY ACKNOWLEDGES THAT SIGMA DOES NOT CONTROL
 * THE TRANSFER OF DATA OVER COMMUNICATIONS FACILITIES, INCLUDING THE INTERNET,
 * AND THAT THE SERVICES MAY BE SUBJECT TO LIMITATIONS, DELAYS, AND OTHER PROBLEMS
 * INHERENT IN THE USE OF SUCH COMMUNICATIONS FACILITIES. SIGMA IS NOT RESPONSIBLE
 * FOR ANY DELAYS, DELIVERY FAILURES, OR OTHER DAMAGE RESULTING FROM SUCH ISSUES.
 * SIGMA IS NOT RESPONSIBLE FOR ANY ISSUES RELATED TO THE PERFORMANCE, OPERATION
 * OR SECURITY OF THE THIRD PARTY SERVICE ENVIRONMENT OR CLOUD SERVICES
 * ENVIRONMENT THAT ARISE FROM COMPANY CONTENT, COMPANY APPLICATIONS OR THIRD
 * PARTY CONTENT. SIGMA DOES NOT MAKE ANY REPRESENTATION OR WARRANTY REGARDING THE
 * RELIABILITY, ACCURACY, COMPLETENESS, CORRECTNESS, OR USEFULNESS OF THIRD PARTY
 * CONTENT OR SERVICE OR THE SIGMA PROGRAM, AND DISCLAIMS ALL LIABILITIES ARISING
 * FROM OR RELATED TO THE SIGMA PROGRAM OR THIRD PARTY CONTENT OR SERVICES. TO THE
 * EXTENT NOT PROHIBITED BY LAW, THESE WARRANTIES ARE EXCLUSIVE. SIGMA OFFERS NO
 * WARRANTY OF NON-INFRINGEMENT, TITLE, OR QUIET ENJOYMENT. NEITHER SIGMA NOR ITS
 * SUPPLIERS OR LICENSORS SHALL BE LIABLE FOR ANY INDIRECT, SPECIAL, INCIDENTAL OR
 * CONSEQUENTIAL DAMAGES OR LOSS (INCLUDING DAMAGES FOR LOSS OF BUSINESS, LOSS OF
 * PROFITS, OR THE LIKE), ARISING OUT OF THIS AGREEMENT WHETHER BASED ON BREACH OF
 * CONTRACT, INTELLECTUAL PROPERTY INFRINGEMENT, TORT (INCLUDING NEGLIGENCE),
 * STRICT LIABILITY, PRODUCT LIABILITY OR OTHERWISE, EVEN IF SIGMA OR ITS
 * REPRESENTATIVES HAVE BEEN ADVISED OF OR OTHERWISE SHOULD KNOW ABOUT THE
 * POSSIBILITY OF SUCH DAMAGES. THERE ARE NO OTHER EXPRESS OR IMPLIED WARRANTIES
 * OR CONDITIONS INCLUDING FOR SOFTWARE, HARDWARE, SYSTEMS, NETWORKS OR
 * ENVIRONMENTS OR FOR MERCHANTABILITY, NONINFRINGEMENT, SATISFACTORY QUALITY AND
 * FITNESS FOR A PARTICULAR PURPOSE.
 *
 * The Sigma Program  is not fault-tolerant and is not designed, manufactured or
 * intended for use or resale as on-line control equipment in hazardous
 * environments requiring fail-safe performance, such as in the operation of
 * nuclear facilities, aircraft navigation or communication systems, air traffic
 * control, direct life support machines, or weapons systems, in which the failure
 * of the Sigma Program, or Company Applications created using the Sigma Program,
 * could lead directly to death, personal injury, or severe physical or
 * environmental damage ("High Risk Activities").  Sigma and its suppliers
 * specifically disclaim any express or implied warranty of fitness for High Risk
 * Activities.Without limiting Sigma’s obligation of confidentiality as further
 * described in the Z-Wave Controller Development Kit Limited License Agreement,
 * Sigma has no obligation to establish and maintain a data privacy and
 * information security program with regard to Company’s use of any Third Party
 * Service Environment or Cloud Service Environment. For the avoidance of doubt,
 * Sigma shall not be responsible for physical, technical, security,
 * administrative, and/or organizational safeguards that are designed to ensure
 * the security and confidentiality of the Company Content or Company Application
 * in any Third Party Service Environment or Cloud Service Environment that
 * Company chooses to utilize.
 */

#include "port.h"
#include <ZW_SerialAPI.h>
#include <stdio.h>
#include "conhandle.h"
#include "ZW_logging.h"
#define RX_ACK_TIMEOUT_DEFAULT  150
#define RX_BYTE_TIMEOUT_DEFAULT 150



/****************************************************************************/
/*                      PRIVATE TYPES and DEFINITIONS                       */
/****************************************************************************/
/* serial Protocol handler states */
typedef enum
{
    stateSOFHunt = 0,
    stateLen = 1,
    stateType = 2,
    stateCmd = 3,
    stateData = 4,
    stateChecksum = 5
} T_CON_TYPE;

/****************************************************************************/
/*                              PRIVATE DATA                                */
/****************************************************************************/
BYTE serBuf[SERBUF_MAX];
BYTE serBufLen;

static BYTE con_state;
static BYTE bChecksum_RX;
static PORT_TIMER timeOutACK;
static PORT_TIMER timeOutRX;

static BOOL rxActive = FALSE;
static char AckNakNeeded = FALSE;

/****************************************************************************/
/*                           EXPORTED FUNCTIONS                             */
/****************************************************************************/

/*===============================   ConTxFrame   =============================
**
**   Transmit frame via serial port by adding SOF, Len, Type, cmd and Chksum.
**   Frame  : SOF-Len-Type-Cmd-DATA-Chksum
**    where SOF is Start of frame byte
**          Len is length of bytes between and including Len to last DATA byte
**          Type is Response or Request
**          Cmd Serial application command describing what DATA is
**          DATA as it says
**          Chksum is a XOR checksum taken on all BYTEs from Len to last DATA byte
**
**          NOTE: If Buf is NULL then the previously used cmd, type, Buf and len
**          is used again (Retransmission)
**
**--------------------------------------------------------------------------*/
void                            /*RET Nothing */
ConTxFrame(BYTE cmd,            /* IN Command */
           BYTE type,           /* IN frame Type to send (Response or Request) */
           BYTE * Buf,          /* IN pointer to BYTE buffer containing DATA to send */
           BYTE len)
{                               /* IN the length of DATA to transmit */
    static BYTE wCmd, wType, wLen, *wBuf;
    BYTE i, bChecksum;

    //if (Buf != NULL)
    {
        wBuf = Buf;
        wLen = len;
        wCmd = cmd;
        wType = type;
    }
    bChecksum = 0xFF;           /* Initialize checksum */
    SerialPutByte(SOF);
    SerialPutByte(wLen + 3);    // Remember the 'len', 'type' and 'cmd' bytes
    bChecksum ^= (wLen + 3);
    SerialPutByte(wType);
    bChecksum ^= wType;
    SerialPutByte(wCmd);
    bChecksum ^= wCmd;
    for (i = 0; (wBuf != NULL) && (i < wLen); i++) {
        SerialPutByte(wBuf[i]);
        bChecksum ^= wBuf[i];
    }
    SerialPutByte(bChecksum);   // XOR checksum of
    SerialFlush();              //Start sending frame to the host.
    AckNakNeeded = 1;           // Now we need an ACK...
    PORT_TIMER_RESTART(timeOutACK);
}

/*==============================   ConUpdate   =============================
**
**   Parses serial data sent from external controller module (PC-controller).
**   Should be frequently called by main loop.
**
**   Return: conIdle          if nothing has happened
**           conFrameReceived if valid frame was received
**           conFrameSent     if transmitted frame was ACKed by other end
**           conFrameErr      if received frame has error in Checksum
**           conRxTimeout     if a Rx timeout happened
**           conTxTimeout     if a Tx timeout waiting for ACK happened
**
**--------------------------------------------------------------------------*/
enum T_CON_TYPE                 /*RET conState - See above */
ConUpdate(BYTE acknowledge)
{                               /* IN do we send acknowledge and handle frame if received correctly */
    int c;
    enum T_CON_TYPE retVal = conIdle;

    if (SerialCheck()) {
        do {
            c = SerialGetByte();
            LOG_PRINTF("c = :%x", c);     //监测串口数据
            if (c < 0) {
                break;
            }
            switch (con_state) {
              case stateSOFHunt:
                  if (c == SOF) {
                      LOG_PRINTF("SOF\n");
                      bChecksum_RX = 0xff;
                      serBufLen = 0;
                      rxActive = 1; // now we're receiving - check for timeout
                      con_state++;
                      PORT_TIMER_RESTART(timeOutRX);
                  } else {
                      if (AckNakNeeded) {
                          if (c == ACK) {
                              LOG_PRINTF("ACK\n");
                              retVal = conFrameSent;
                              AckNakNeeded = 0; // Done
                          } else if (c == NAK) {
                              LOG_PRINTF("NAK\n");
                              retVal = conTxErr;
                              AckNakNeeded = 0;
                          } else if (c == CAN) {
                              LOG_PRINTF("CAN\n");
                              retVal = conTxWait;
                              AckNakNeeded = 0;
                          } else {
                              // Bogus character received...
                          }
                      }
                  }
                  break;

              case stateLen:
                  // Check for length to be inside valid range
                  if ((c < FRAME_LENGTH_MIN) || (c > FRAME_LENGTH_MAX)) {
                      con_state = stateSOFHunt; // Restart looking for SOF
                      rxActive = 0; // Not really active now...
                      break;
                  }

              case stateType:
                  if (serBufLen && (c > RESPONSE)) {
                      con_state = stateSOFHunt; // Restart looking for SOF
                      rxActive = 0; // Not really active now...
                      break;
                  }

              case stateCmd:
                  con_state++;

              case stateData:
                  if (serBufLen < SERBUF_MAX) {
                      serBuf[serBufLen] = c;
                      serBufLen++;
                      bChecksum_RX ^= c;
                      if (serBufLen >= serFrameLen) {
                          con_state++;
                      }
                  } else {
                      con_state++;
                  }
                  timer_restart(&timeOutRX);
                  break;

              case stateChecksum:
                  /* Do we send ACK/NAK according to checksum... */
                  /* if not then the received frame is dropped! */
                  if (acknowledge) {
                      if (c == bChecksum_RX) {
                          SerialPutByte(ACK);
                          SerialFlush();    //Start sending frame to the host.
                          retVal = conFrameReceived;    // Tell THE world that we got a packet
                          LOG_PRINTF("Tell THE world that we got a packet\n");
                      } else {
                          SerialPutByte(NAK);   // Tell them something is wrong...
                          SerialFlush();    //Start sending frame to the host.
                          retVal = conFrameErr;
                          printf("****************** CRC ERROR ***********************\n");
                      }
                  } else {
                      // We are in the process of looking for an acknowledge to a callback request
                      // Drop the new frame we received - we don't have time to handle it.
                      // Send a CAN to indicate what is happening...
                      SerialPutByte(CAN);
                      SerialFlush();    //Start sending frame to the host.
                  }

              default:
                  con_state = stateSOFHunt; // Restart looking for SOF
                  rxActive = 0; // Not really active now...
                  break;
            }
        } while ((retVal == conIdle) && SerialCheck());
    }
    /* Check for timeouts - if no other events detected */
    if (retVal == conIdle) {
        /* Are in the middle of collecting a frame and have we timed out? */
        if (rxActive && PORT_TIMER_EXPIRED(timeOutRX)) {
            /* Reset to SOF hunting */
            con_state = stateSOFHunt;
            rxActive = 0;       /* Not inframe anymore */
            retVal = conRxTimeout;
        }
        /* Are we waiting for ACK and have we timed out? */
        if (AckNakNeeded && PORT_TIMER_EXPIRED(timeOutACK)) {
            /* Not waiting for ACK anymore */
            AckNakNeeded = 0;
            /* Tell upper layer we could not get the frame through */
            retVal = conTxTimeout;
        }
    }
    return retVal;
}

/*==============================   ConInit   =============================
**
**   Initialize the module.
**
**--------------------------------------------------------------------------*/
int                             /*RET  Nothing */
ConInit(const char *serial_port)
{                               /*IN   Nothing */
    BYTE rc;
    serBufLen = 0;
    con_state = stateSOFHunt;

    PORT_TIMER_INIT(timeOutACK, RX_ACK_TIMEOUT_DEFAULT * 10);
    PORT_TIMER_INIT(timeOutRX, RX_BYTE_TIMEOUT_DEFAULT * 10);
    rc = SerialInit(serial_port);
    if (rc) {
        /*Send ACK in case that the target expects one. */
        SerialPutByte(ACK);
    }
    return rc;
}

void ConDestroy()
{
    SerialClose();
}

const char *ConTypeToStr(enum T_CON_TYPE t)
{
    switch (t) {
      case conIdle:            // returned if nothing special has happened
          return "conIdle";
      case conFrameReceived:   // returned when a valid frame has been received
          return "conFrameReceived";
      case conFrameSent:       // returned if frame was ACKed by the other end
          return "conFrameSent";
      case conFrameErr:        // returned if frame has error in Checksum
          return "conFrameErr";
      case conRxTimeout:       // returned if Rx timeout has happened
          return "conRxTimeout";
      case conTxTimeout:       // returned if Tx timeout (waiting for ACK) ahs happened
          return "conTxTimeout";
      case conTxErr:           // We got a NAK after sending
          return "conTxErr";
      case conTxWait:          // We got a CAN while sending
          return "conTxWait";
    }
    return NULL;
}
