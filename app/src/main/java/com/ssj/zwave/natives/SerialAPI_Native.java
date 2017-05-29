package com.ssj.zwave.natives;

import com.ssj.zwave.serialapi.SerialAPI;

public class SerialAPI_Native {
    private SerialAPI serialAPI;

    public SerialAPI_Native(SerialAPI serialAPI) {
        this.serialAPI = serialAPI;
    }

    /**
    * Function: send data frame to serial port
    * @param cmd command
    * @param Buf byte Buffer containing data to send
    * @param len the length of data to transmit
    *
    * @return the result status of transmission
    */
    public int SendFrame(byte cmd, byte[] Buf, byte len) {
        int ret;

        serialAPI.ReadThreadSuspend();
        ret = NativeSendFrame(cmd, Buf, len);
        serialAPI.ReadThreadResume();
        return ret;
    }
    /**
    * Function: send data frame to serial port
    * @param cmd command
    * @param Buf byte Buffer containing data to send
    * @param len the length of data to transmit
    * @param reply the response data frame after transmission success
    * @return the result status of transmission
    * */
    public int SendFrameWithResponse(byte cmd, byte[] Buf, byte len, byte[] reply) {
        int ret;

        serialAPI.ReadThreadSuspend();
        ret = NativeSendFrameWithResponse(cmd, Buf, len, reply);
        serialAPI.ReadThreadResume();

        return ret;
    }

    /**
    * Function Initialize the serial port
    * @param serialPort the serial port name
    * @return Initialize the serial port successful or not
    * */
    public boolean ConInit(String serialPort) {
        return NativeConInit(serialPort);
    }

    /*
    * Function Destroy the serial port
    * */
    public void ConDestroy() {
        NativeConDestroy();
    }

    public boolean SerialAPIPoll(byte[] buffer, SerialAPI serialAPI) {
        return NativeSerialAPIPoll(buffer, serialAPI);
    }

    static {
        System.loadLibrary("zwave");
    }

    private native boolean NativeConInit(String serialPort);
    private native int NativeSendFrameWithResponse(byte cmd, byte[] Buf, byte len, byte[] reply);
    private native int NativeSendFrame(byte cmd, byte[] Buf, byte len);
    private native void NativeConDestroy();
    private native boolean NativeSerialAPIPoll(byte[] buffer, SerialAPI serialAPI);
}
