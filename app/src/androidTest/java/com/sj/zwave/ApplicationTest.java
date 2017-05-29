package com.sj.zwave;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    /*public class SerialAPI_Test extends ZW_ClassCommand {
        SerialAPI_Callbacks serialAPI_callbacks = new SerialAPI_Callbacks(){

        };

        ZW_cbFunc sendData_callback =  new ZW_cbFunc(){
            @Override
            public void cbFuncZWSendData(Short data, ZW_Basis_API.TX_STATUS_TYPE status_type) {
                super.cbFuncZWSendData(data, status_type);

            }
        };

        void hello() {
            SerialAPI serialAPI = new SerialAPI();
            serialAPI.SerialAPI_Init("/dev/tty/ACM0", serialAPI_callbacks);
        }
    }*/
}