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

/****************************************************************************/
/*                              INCLUDE FILES                               */
/****************************************************************************/
#include <unistd.h>

#include "TYPES.H"

#include <string.h>
#include <ZW_basis_api.h>
#include <ZW_SerialAPI.h>
#include <ZW_controller_api.h>
#include <ZW_controller_static_api.h>
#include <ZW_mem_api.h>
#include "port.h"
#include "sys/ctimer.h"

#include "conhandle.h"

#include "Serialapi.h"
#include <string.h>
#include <stdlib.h>
#include <stdio.h>

#include "ZW_logging.h"

#define MAX_RXQUEUE_LEN 10
#define BUF_SIZE  (74+64)

//char *serial_path = NULL;

/****************************************************************************/
/*                              PRIVATE DATA                                */
/****************************************************************************/

typedef struct SerialAPICpabilities
{
    BYTE appl_version;
    BYTE appl_revision;
    BYTE manufactor_id1;
    BYTE manufactor_id2;
    BYTE product_type1;
    BYTE product_type2;
    BYTE product_id1;
    BYTE product_id2;
    BYTE supported_bitmask[29];
    BYTE nodelist[29];
    BYTE chipType;
    BYTE chipVersion;
} SerialAPICpabilities_t;
SerialAPICpabilities_t capabilities;

#undef ASSERT
#ifdef SERIALAPI_DEBUG
#define ASSERT(a) {if(!(a)) __asm("int $3");}
#else
#define ASSERT(a) {if(!(a)) LOG_PRINTF("Assertion failed at %s:%i\n", __FILE__,__LINE__ );}
#endif

#define SupportsCommand(cmd) (cmd==FUNC_ID_SERIAL_API_GET_CAPABILITIES || capabilities.supported_bitmask[((cmd-1)>>3)]  & (1<<((cmd-1) & 0x7)))

BYTE buffer[BUF_SIZE];
BYTE pCmd[BUF_SIZE];

struct list
{
    void *__data;
    struct list *next;
    BYTE len;
};
static struct list *rxQueue;

static BYTE byLen;

#define TIMEOUT_TIME 1600

#define IDX_CMD   2
#define IDX_DATA  3
#define data __data

struct ZW_timer
{
/*  PORT_TIMER timer;*/
    struct ctimer timer;
    BYTE repeats;
    void (*f) ();
};

/***************************** Timers ***********************************/
static struct ZW_timer timers[0x10];

BYTE TimerStart(void (*func) (), BYTE timerTicks, BYTE repeats)
{
    return ZW_LTimerStart(func, timerTicks, repeats);
}

BYTE TimerRestart(BYTE handle)
{
    return ZW_LTimerRestart(handle);
}

BYTE TimerCancel(BYTE handle)
{
    return ZW_LTimerCancel(handle);
}

void timer_timeout(void *p)
{
    struct ZW_timer *t = (struct ZW_timer *)p;

    t->f();
    if (t->repeats > 0 && t->repeats != TIMER_FOREVER) {
        t->repeats--;
    }

    if (t->repeats == 0) {
        t->f = 0;
    } else {
        ctimer_restart(&t->timer);
    }
}

/**
 * Create a new timer.
 *
 * @param[in] func         Callback to be called when timer expires.
 * @param[in] timerTicks   Timer interval in units of 10ms
 * @param[in] repeats      Number of times the timer fires. 0xFF makes the timer fire forever
 * \retval a handle to the timer just created.
 */
BYTE ZW_LTimerStart(void (*func) (), unsigned long timerTicks, BYTE repeats)
{
    uint8_t i;
    for (i = 0; i < sizeof(timers) / (sizeof(struct ZW_timer)); i++) {
        if (timers[i].f == NULL) {
            timers[i].f = func;
            timers[i].repeats = repeats;
            ctimer_set(&timers[i].timer, timerTicks * 10, timer_timeout, &timers[i]);
            return i;
        }
    }
    ASSERT(0);
    return 0xFF;
}

/**
 * Restart the timer
 * @param[in] handle Handle of timer to restart
 */
BYTE ZW_LTimerRestart(BYTE handle)
{
    if (handle < (sizeof(timers) / (sizeof(struct ZW_timer)))) {
        ctimer_reset(&timers[handle].timer);
        return TRUE;
    } else {
        return FALSE;
    }
}

/**
 * Cancel the timer
 * @param[in] handle Handle of timer to cancel
 */
BYTE ZW_LTimerCancel(BYTE handle)
{
    if (handle < (sizeof(timers) / (sizeof(struct ZW_timer)))) {
        ctimer_stop(&timers[handle].timer);
        timers[handle].f = 0;
        return TRUE;
    } else {
        return FALSE;
    }
}

/**********************************************************/
/**
 * ingroup BASIS
 * \macro{ZW_RANDOM()}
 *
 * A pseudo-random number generator that generates a sequence of numbers,
 * the elements of which are approximately independent of each other.
 * The same sequence of pseudo-random numbers will be repeated in
 * case the module is power cycled. The Z-Wave protocol uses also this
 * function in the random backoff algorithm etc.
 *
 * return
 * Random number (0 – 0xFF)
 *
 *
 * serialapi{
 * HOST->ZW: REQ | 0x1D
 * ZW->HOST: RES | 0x1D | rndNo
 * }
 */
BYTE ZW_Random()
{
    return PORT_RANDOM() & 0xFF;
}

static void test(void)
{
    LOG_PRINTF("hello world");
}

/**
  * ingroup SerialAPI
  * return = TRUE if initialization was succesful
  */
BOOL SerialAPI_Init(void)
{
    int i;

    for (i = 0; i < sizeof(timers) / sizeof(struct ZW_timer); i++) {
        ctimer_stop(&timers[i].timer);
        timers[i].f = 0;
    }

    /*Get Capabilities of serial API */
    byLen = 0;
    if (!SendFrameWithResponse(FUNC_ID_SERIAL_API_GET_CAPABILITIES, 0, 0, buffer, &byLen)) {
        LOG_PRINTF
            ("SendFrameWithResponse(FUNC_ID_SERIAL_API_GET_CAPABILITIES,...) failed in SerialAPI_Init()");
        ASSERT(0);
        return FALSE;
    }
    memcpy(&capabilities, &(buffer[IDX_DATA]), byLen - IDX_DATA);

    ZW_TIMER_START(test, 100, TIMER_FOREVER);

    return TRUE;
}

/* 
 Give the number of outstanding packet in rxQueue
*/
int rxQueue_Len(void)
{
    struct list *q = rxQueue;
    int len = 0;

    while (q) {
        q = q->next;
        len++;
    }
    return len;
}

/* 
 Flush rxQueue
*/
void SerialFlushQueue(void)
{
    struct list *l;
    while (rxQueue) {
        l = rxQueue;
        rxQueue = rxQueue->next;
        free(l->data);
        free(l);
    }
}

/**
 * TODO get rid of malloc
 */
static void QueueFrame()
{
    struct list *l, *q;
    if (rxQueue_Len() >= MAX_RXQUEUE_LEN) {
        printf("rxQueue is Full !!!");
        return;
    }
    printf("rxQueue is not full");

    l = (struct list *)malloc(sizeof(struct list));
    l->data = malloc(sizeof(serBuf));
    l->next = 0;
    l->len = serBufLen;
    memcpy(l->data, serBuf, serBufLen);

    /*Add frame to end of queue. */
    if (rxQueue) {
        for (q = rxQueue; q->next; q = q->next) ;
        q->next = l;
    } else {
        rxQueue = l;
    }
}

int WaitResponse()
{
    int ret;
    PORT_TIMER t;
    PORT_TIMER_INIT(t, TIMEOUT_TIME);

    while (1) {
        ret = ConUpdate(TRUE);
        if (ret != conIdle) {
            break;
        }

        if (PORT_TIMER_EXPIRED(t)) {
            LOG_PRINTF("WaitResponse Timeout");
            ret = conRxTimeout;
            break;
        }
    }
    return ret;
}

static void DrainRX()
{
    while (ConUpdate(TRUE) == conFrameReceived) {
        if (serBuf[1] == REQUEST) {
            QueueFrame();
        }
    }
}

int SendFrame(BYTE cmd, BYTE * Buf, BYTE len)
{
    int i;
    enum T_CON_TYPE ret;
    PORT_TIMER t;
    if (!SupportsCommand(cmd)) {
        LOG_PRINTF("Command: 0x%x is not supported by this SerialAPI", (unsigned)cmd);
        ASSERT(0);
        return conTxErr;
    }
    /*First check for incoming. */
    DrainRX();

    ConTxFrame(cmd, REQUEST, Buf, len);
    for (i = 0; i < 20; i++) {
        ret = WaitResponse();
        switch (ret) {
          case conFrameSent:
              return ret;
          case conFrameReceived:
              if (serBuf[1] == REQUEST) {
                  QueueFrame();
              }
              LOG_PRINTF("Got RESPONSE frame while sending....");
              continue;  /*Go back, there should be more */
          case conTxWait:
              break;
          default:
              break;
        }
        //LOG_PRINTF("Retransmission %i of %2x %s\n",i,cmd, ConTypeToStr(ret));

        LOG_PRINTF("Retransmission %d of 0x%02x", i, cmd);

        /* It seems that the serial port sometimes stalls on osx, this seems to help */
        if ((i & 7) == 7) {
            LOG_PRINTF("Reopening serial port");
            SerialClose();
            SerialInit(SERIAL_PORT);
        }
        SerialFlush();
        /*TODO consider to use an exponential backoff, and do not backoff until our own framehandler is idle. Also
         * the magnitude of the backoff seem very large... this is to be analyzed. */
        PORT_TIMER_INIT(t, 10 + i * 100);
        while (!PORT_TIMER_EXPIRED(t)) {
            DrainRX();
        }

        ConTxFrame(cmd, REQUEST, Buf, len);
    }
    LOG_PRINTF("Unable to send frame!!!!!!");
    ASSERT(0);
    return ret;
}

int SendFrameWithResponse(BYTE cmd, BYTE * Buf, BYTE len, BYTE * reply, BYTE * replyLen)
{
    int ret;
    int i;

    ret = SendFrame(cmd, Buf, len);
    if (ret == conFrameSent) {
        for (i = 0; i < 3; i++) {
            ret = WaitResponse();
            if (ret == conFrameReceived) {
                if (serBuf[1] == REQUEST) {
                    QueueFrame();
                } else {
                    if (serBuf[IDX_CMD] == cmd) {
                        memcpy(reply, serBuf, serFrameLen);

                        if (replyLen)
                            *replyLen = serFrameLen;
                        return ret;
                    } else {
                        LOG_PRINTF("Got new frame while sending %d", i);
                    }
                }
            } else {
                LOG_PRINTF("Unexpected receive state! %s", ConTypeToStr(ret));
            }
        }
    }
    LOG_PRINTF("SendFrameWithResponse() returning failure");
    return 0;
}

/**
 * ingroup SerialAPI
 * Serial port polling loop.
 * This should be called continuously from a main loop. All callbacks are
 * called as a decendant of this loop.
 */
uint8_t SerialAPI_Poll(JNIEnv *env, jobject serialapi, jbyte *jbuffer)
{
    struct list *l;
    static int count = 0;
    static int flag = 0;
    int mPoll = 1;
    jmethodID jm_dispatch;
    jclass jclz_serialapi;

    jclz_serialapi = (*env)->FindClass(env, "com/archermind/zwave/serialapi/SerialAPI");
    jm_dispatch = (*env)->GetMethodID(env, jclz_serialapi, "Dispatch", "()V");

    if (rxQueue) {
        l = rxQueue;
        rxQueue = rxQueue->next;
        serBufLen = l->len;
        memcpy(serBuf, l->data, l->len);
        memset(jbuffer, 0, sizeof(jbuffer));
        memcpy(jbuffer, l->data, l->len);

        int k;
        for (k = 0; k < 4; ++k)
        {
            LOG_PRINTF("serBuf = :%x ", serBuf[k] & 0xff);
            LOG_PRINTF("jbuffer = :%x ", jbuffer[k] & 0xff);
        }
        LOG_PRINTF("\n");

        LOG_PRINTF("length %d", l->len);
        //(*env)->CallVoidMethod(env, serialapi, jm_dispatch);

        free(l->data);
        free(l);
        count++;
        mPoll = 0;
    }

    if (count % 2 == 1 && mPoll == 1)
    {
        (*env)->CallVoidMethod(env, serialapi, jm_dispatch);
        LOG_PRINTF("Recive Data");
        //count++;
        flag = 1;
        count = 0;
    }
    if (flag == 1)
    {
        memset(jbuffer, 0, sizeof(jbuffer));
        flag = 0;
    }
    DrainRX();
    return rxQueue > 0;
}


























