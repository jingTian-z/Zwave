#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <jni.h>
#include <assert.h>

#include "Serialapi.h"
#include "conhandle.h"
#include "ZW_logging.h"

#define JNIREG_CLASS "com/archermind/zwave/natives/SerialAPI_Native"


JNIEXPORT jboolean JNICALL native_ConInit(JNIEnv *env, jclass clazz, jstring serialPort)
{
    jboolean ret;
    const char* serial_port;
    jboolean isCopy;
    serial_port = (*env)->GetStringUTFChars(env, serialPort, &isCopy);

    ret = ConInit(serial_port);

    if (isCopy == JNI_TRUE) {
        (*env)->ReleaseStringUTFChars(env, serialPort, serial_port);
    }

    if(ret == FALSE)
        return ret;

    ret = SerialAPI_Init();

    return ret;
}



JNIEXPORT jint JNICALL native_SendFrame(JNIEnv *env, jclass clazz, jbyte cmd, jbyteArray Buf, jbyte len)
{
    jint ret;
    jbyte *jbuf;

    if ((Buf != NULL) && (len != 0)) {
        jbuf = (jbyte *) malloc(len * sizeof(jbyte));
        (*env)->GetByteArrayRegion(env, Buf, 0, len, jbuf);
    } else {
        jbuf = NULL;
    }

    ret = SendFrame(cmd, jbuf, len);

    if (jbuf != NULL)
        free(jbuf);

    return ret;
}


JNIEXPORT jint JNICALL native_SendFrameWithResponse(JNIEnv *env, jclass clazz,
                                                      jbyte cmd,        /* IN Command */
                                                      jbyteArray Buf,      /* IN pointer to BYTE buffer containing DATA to send */
                                                      jbyte len,
                                                      jbyteArray reply) {
    jint ret;
    jbyte replyLen;
    jbyte *jbuf;

    if ((Buf != NULL) && (len != 0)) {
        jbuf = (jbyte *) malloc(len * sizeof(jbyte));
        (*env)->GetByteArrayRegion(env, Buf, 0, len, jbuf);
    } else {
        jbuf = NULL;
    }

    jbyte *jreply = (*env)-> GetByteArrayElements(env, reply, NULL);

    ret = SendFrameWithResponse(cmd, jbuf, len, jreply, &replyLen);

    if (jbuf != NULL)
        free(jbuf);

    (*env)->ReleaseByteArrayElements(env, reply, jreply, 0);

    return (ret << 8  | replyLen);
}

JNIEXPORT jboolean JNICALL native_SerialAPIPoll(JNIEnv *env, jclass clazz, jbyteArray Buf,
                                                jobject serialapi)
{
    jboolean ret;
    jbyte *jbuffer = (*env)-> GetByteArrayElements(env, Buf, NULL);

    ret = SerialAPI_Poll(env, serialapi, jbuffer);
    (*env)->ReleaseByteArrayElements(env, Buf, jbuffer, 0);
    return ret;
}


/**
* Table of methods associated with a single class.
*/
static JNINativeMethod gMethods[] = {
        { "NativeConInit", "(Ljava/lang/String;)Z", (void*)native_ConInit },
        { "NativeSendFrame", "(B[BB)I", (void*)native_SendFrame },
        { "NativeSendFrameWithResponse", "(B[BB[B)I", (void*)native_SendFrameWithResponse },
        { "NativeConDestroy", "()V", (void*)ConDestroy },
        { "NativeSerialAPIPoll", "([BLcom/archermind/zwave/serialapi/SerialAPI;)Z", (void*)native_SerialAPIPoll },

};

/*
* Register several native methods for one class.
*/
static int registerNativeMethods(JNIEnv* env, const char* className,
                                 JNINativeMethod* gMethods, int numMethods)
{
    jclass clazz;
    clazz = (*env)->FindClass(env, className);
    if (clazz == NULL) {
        return JNI_FALSE;
    }
    if ((*env)->RegisterNatives(env, clazz, gMethods, numMethods) < 0) {
        return JNI_FALSE;
    }

    return JNI_TRUE;
}


/*
* Register native methods for all classes we know about.
*/
static int registerNatives(JNIEnv* env)
{
    if (!registerNativeMethods(env, JNIREG_CLASS, gMethods,
                               sizeof(gMethods) / sizeof(gMethods[0])))
        return JNI_FALSE;

    return JNI_TRUE;
}

/*
* Set some test stuff up.
*
* Returns the JNI version on success, -1 on failure.
*/
JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* vm, void* reserved)
{
    JNIEnv* env = NULL;
    jint result = -1;

    if ((*vm)->GetEnv(vm, (void**) &env, JNI_VERSION_1_4) != JNI_OK) {
        return -1;
    }
    assert(env != NULL);

    if (!registerNatives(env)) {//注册
        return -1;
    }
    /* success -- return valid version number */
    result = JNI_VERSION_1_4;

    return result;
}