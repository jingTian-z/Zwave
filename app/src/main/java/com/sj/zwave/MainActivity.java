package com.sj.zwave;

import android.os.*;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.WindowManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Process;
import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends FragmentActivity implements MainFragment.OnHandler{
    private Stack<Fragment> fragmentStack;
    private DoubleClickExitHelper DoubleClickExit;
    private MainFragment mainFragment;
    private SettingsFragment settingsFragment;

    SerialAPIHandlerThread handlerThread;
    MainFragment.updateHandler updatehandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        DoubleClickExit = new DoubleClickExitHelper(this);
        fragmentStack = new Stack<>();
        initView();
        ApplicationManager.getApplicationManager().addActivity(this);
    }

    private void initView(){
        mainFragment = new MainFragment();
        settingsFragment = new SettingsFragment();
        updatehandler = mainFragment.getUpdatehandler();

        handlerThread = new SerialAPIHandlerThread();
        handlerThread.start();

        final Message msg = new Message();
        msg.what = handlerThread.SERIALAPI_INIT;
        Bundle bundle = new Bundle();
        bundle.putString("SerialPort", "/dev/ttyACM0");
        msg.setData(bundle);
        handlerThread.sendMessage(msg);

        new Thread(new Runnable() {
            @Override
            public void run() {
                String line;
                Process mLogcatProc;
                BufferedReader reader;
                try{

                    ArrayList<String> clearLog=new ArrayList<>();
                    clearLog.add("logcat");
                    clearLog.add("-c");

                    mLogcatProc = Runtime.getRuntime().exec(new String[] { "logcat","-s", "SERIAL_API" });
                    reader = new BufferedReader(new InputStreamReader(mLogcatProc.getInputStream()));

                    while((line = reader.readLine()) != null){
                        //Runtime.getRuntime().exec(clearLog.toArray(new String[clearLog.size()]));
                        if (line.contains(String.valueOf(android.os.Process.myPid()))){
                            Message msg = updatehandler.obtainMessage();
                            msg.what = 1;
                            msg.obj = line;
                            if (line.contains("0x13"))
                                msg.arg1 = 0x13;
                            updatehandler.sendMessage(msg);
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();

        showMainFragment();
    }
    private void setFragment(Fragment fragment){
        FragmentManager fManager = getSupportFragmentManager();
        FragmentTransaction fTransaction = fManager.beginTransaction();
        fTransaction.setCustomAnimations(R.anim.abc_popup_enter, R.anim.abc_popup_exit);
        fTransaction.replace(R.id.container, fragment);
        fTransaction.commit();
    }

    private void showFragment(Fragment fragment){
        fragmentStack.push(fragment);
        setFragment(fragment);
    }
    public void backToPreFragment(){
        if (fragmentStack.size() == 1){
            return;
        }
        fragmentStack.pop();
        setFragment(fragmentStack.peek());
    }

    public void showMainFragment(){
        showFragment(mainFragment);
    }

    public void showSettingsFragment(){
        showFragment(settingsFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (mainFragment.isVisible())
                return DoubleClickExit.onKeyDown(keyCode, event);
            else {
                backToPreFragment();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public SerialAPIHandlerThread getHandlerObj() {
        return handlerThread;
    }
}
