package com.sj.zwave;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class MainFragment extends Fragment implements View.OnClickListener{
    SerialAPIHandlerThread handlerThread;
    updateHandler updatehandler = new updateHandler();

    public Button clear;
    public Button addNode;
    public Button rmNode;
    public Button setAssociation;
    public Button rmAssociation;
    public Spinner addgroup_spinner;
    public Spinner rmgroup_spinner;
    public Button param50;
    public Button param51;
    public Button on;
    public Button off;
    public TextView logView;
    public ScrollView sll;
    public Button cleaLog;

    //@Bind(R.id.setDefault) public Button clear;
    //@Bind(R.id.addNode) public Button addNode;
    //@Bind(R.id.rmNode) public Button rmNode;
    //@Bind(R.id.setAssociation) public Button setAssociation;
    //@Bind(R.id.rmAssociation) public Button rmAssociation;
    //@Bind(R.id.grouplist) public Spinner addgroup_spinner;
    //@Bind(R.id.rmgrouplist) public Spinner rmgroup_spinner;
    //@Bind(R.id.param50) public Button param50;
    //@Bind(R.id.param51) public Button param51;
    //@Bind(R.id.on) public Button on;
    //@Bind(R.id.off) public Button off;
    //@Bind(R.id.tx_settings) public TextView settings;
    //@Bind(R.id.logView) public TextView logView;
    //@Bind(R.id.sllv) public ScrollView sll;
    //@Bind(R.id.clog) public Button cleaLog;

    MainActivity mainActivity;
    Message msg;
    private List<Integer> group_list;
    private ArrayAdapter<Integer> group_adapter;
    private ArrayAdapter<Integer> rmGroup_adapter;
    String str;

    View view;

    Integer groupID;
    Integer rmGroupId;

    public MainFragment() {

    }

    public Button getOnButton() {return on;}

    public updateHandler getUpdatehandler(){
        return updatehandler;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);

        initView();
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        //mainActivity = (MainActivity)activity;
        //handlerThread =mainActivity.getHandlerObj();
    }

    public void initView(){
        mainActivity = (MainActivity)getActivity();
        handlerThread =mainActivity.getHandlerObj();

        clear = (Button)view.findViewById(R.id.setDefault);
        addNode = (Button)view.findViewById(R.id.addNode);
        rmNode = (Button)view.findViewById(R.id.rmNode);
        setAssociation = (Button)view.findViewById(R.id.setAssociation);
        rmAssociation = (Button)view.findViewById(R.id.rmAssociation);
        param50 = (Button)view.findViewById(R.id.param50);
        param51 = (Button)view.findViewById(R.id.param51);
        on = (Button)view.findViewById(R.id.on);
        off = (Button)view.findViewById(R.id.off);
        cleaLog = (Button)view.findViewById(R.id.clog);

        sll = (ScrollView)view.findViewById(R.id.sllv);
        logView = (TextView)view.findViewById(R.id.logView);
        addgroup_spinner = (Spinner)view.findViewById(R.id.grouplist);
        rmgroup_spinner = (Spinner)view.findViewById(R.id.rmgrouplist);


        clear.setOnClickListener(this);
        addNode.setOnClickListener(this);
        rmNode.setOnClickListener(this);
        setAssociation.setOnClickListener(this);
        rmAssociation.setOnClickListener(this);
        param50.setOnClickListener(this);
        param51.setOnClickListener(this);
        on.setOnClickListener(this);
        off.setOnClickListener(this);
        cleaLog.setOnClickListener(this);

        group_list = new ArrayList<>();
        group_list.add(1);
        group_list.add(2);
        group_list.add(3);

        group_adapter= new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, group_list);
        group_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        addgroup_spinner.setAdapter(group_adapter);

        rmGroup_adapter= new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, group_list);
        rmGroup_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rmgroup_spinner.setAdapter(rmGroup_adapter);

        addgroup_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                groupID = group_list.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        rmgroup_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                rmGroupId = group_list.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
           /* case R.id.tx_settings:
                mainActivity.showSettingsFragment();
                oldLine = logView.getText().toString();
                break;*/
            case R.id.setDefault:
                msg = Message.obtain();
                msg.what = handlerThread.SET_DEFAULT;
                handlerThread.sendMessage(msg);
                break;
            case R.id.addNode:
                Log.d("Zwave", "AddNode start");
                msg = Message.obtain();
                msg.what = handlerThread.ADD_NODE_TO_NETWORK;
                handlerThread.sendMessage(msg);
                break;
            case R.id.rmNode:
                Message msg = Message.obtain();
                msg.what = handlerThread.RM_NODE_FROM_NETWORK;
                handlerThread.sendMessage(msg);
                break;
            case R.id.setAssociation:
                msg = Message.obtain();
                msg.what = handlerThread.SET_ASSOCIATION;
                msg.arg1 = groupID;
                handlerThread.sendMessage(msg);
                break;
            case R.id.rmAssociation:
                msg = Message.obtain();
                msg.what = handlerThread.RM_ASSOCIATION;
                msg.arg1 = rmGroupId;
                handlerThread.sendMessage(msg);
                break;
            case R.id.param50:
                msg = Message.obtain();
                msg.what = handlerThread.PARAM50;
                handlerThread.sendMessage(msg);
                break;
            case R.id.param51:
                msg = Message.obtain();
                msg.what = handlerThread.PARAM51;
                handlerThread.sendMessage(msg);
                break;
            case R.id.on:
                msg = Message.obtain();
                msg.what = handlerThread.ON;
                handlerThread.sendMessage(msg);
                on.setClickable(false);
                off.setClickable(false);
                break;
            case R.id.off:
                msg = Message.obtain();
                msg.what = handlerThread.OFF;
                handlerThread.sendMessage(msg);
                off.setClickable(false);
                on.setClickable(false);
                break;
            case R.id.clog:
                Message msg2 = updatehandler.obtainMessage();
                msg2.what = 2;
                updatehandler.sendMessage(msg2);
                break;
            default:
                break;
        }

    }

    public class updateHandler extends Handler {

        @Override
        public void handleMessage(Message msg) {
            Log.d("Zwave", "msg" + String.valueOf(msg.what));

            switch (msg.what){
                case 1:
                    str = (String)msg.obj;
                    logView.append(str + "\n");
                    if (msg.arg1 == 0x13) {
                        if (!on.isClickable())
                            on.setClickable(true);
                        if (!off.isClickable())
                            off.setClickable(true);
                    }
                    sll.fullScroll(ScrollView.FOCUS_DOWN);
                    break;
                case 2:
                    logView.setText("");
                    break;
                default:
                    break;
            }
        }
    }

    public interface OnHandler{
         SerialAPIHandlerThread getHandlerObj();
    }
}
