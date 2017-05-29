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

#ifndef SERIAL_API_H_
#define SERIAL_API_H_

#include "TYPES.H"

#define ZW_CONTROLLER
#define ZW_CONTROLLER_BRIDGE

#include "ZW_SerialAPI.h"
#include "ZW_basis_api.h"
#include "ZW_controller_api.h"
#include "ZW_transport_api.h"
#include "ZW_timer_api.h"
#include <jni.h>

/*
 * Initialize the Serial API.
 */
BOOL SerialAPI_Init(void);
void SerialAPI_Destroy();

int SendFrame(BYTE cmd,  /* IN Command */
              BYTE * Buf,    /* IN pointer to BYTE buffer containing DATA to send */
              BYTE len);

int SendFrameWithResponse(BYTE cmd, BYTE * Buf, BYTE len, BYTE * reply, BYTE * replyLen);

/*
 * This must be called from some application main loop. This is what driver the
 * serial api engine. SerialAPI_Poll checks the serial port for new data and
 * handles timers and all other async callbacks. Ie. all Serial API callbacks
 * are called from within this function.
 *
 * TODO: It would be nice to have SerialAPI_Poll return the minimum number of system
 * ticks to parse before a timer times out. In this way we don't need to call
 * SerialAPI_Poll unless we got a receive interrupt from the uart or if a timer
 * has timed out. This means that the system would be able to go into low power
 * mode between SerialAPI_Poll calls.
 */
uint8_t SerialAPI_Poll(JNIEnv *env, jobject serialapi, jbyte *jbuffer);

/** Used to indicate that transmissions was not completed due to a
 * SendData that returned false. This is used in some of the higher level sendata
 * calls where lower layer senddata is called async. */
#define TRANSMIT_COMPLETE_ERROR 0xFF

BYTE SerialAPI_GetInitData(BYTE * ver, BYTE * capabilities, BYTE * len, BYTE * nodesList,
                           BYTE * chip_type, BYTE * chip_version);

BOOL SerialAPI_GetRandom(BYTE count, BYTE * randomBytes);

/* Long timers */
BYTE ZW_LTimerStart(void (*func) (), unsigned long timerTicks, BYTE repeats);
BYTE ZW_LTimerRestart(BYTE handle);
BYTE ZW_LTimerCancel(BYTE handle);

/* Access hardware AES encrypter. ext_input,ext_output,ext_key are all 16 byte arrays
 * Returns true if routine went well. */
BOOL SerialAPI_AES128_Encrypt(const BYTE * ext_input, BYTE * ext_output, const BYTE * ext_key);

/*FIXME Don't know why this is not defined elsewhere */
BOOL ZW_EnableSUC(BYTE state, BYTE capabilities);

void
SerialAPI_ApplicationSlaveNodeInformation(BYTE dstNode, BYTE listening,
                                          APPL_NODE_TYPE nodeType, BYTE * nodeParm,
                                          BYTE parmLength);

void Get_SerialAPI_AppVersion(uint8_t * major, uint8_t * minor);

/**
 * Enable APM mode
 */
void ZW_AutoProgrammingEnable(void);

/* Add more command classes to NIF and update Z-Wave target.
 * Make sure to add less than sizeof(MyNIF) CCs in total. */
void AddUnsocDestCCsToGW(BYTE * ccList, BYTE ccCount);

void ZW_GetRoutingInfo_old(BYTE bNodeID, BYTE * buf, BYTE bRemoveBad, BYTE bRemoveNonReps);
#endif                          /* SERIAL_API_H_ */
