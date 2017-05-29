package com.sj.zwave;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class SettingsFragment extends Fragment implements View.OnClickListener {

    public TextView m_back;
    //@Bind(R.id.tx_back) public TextView m_back;

    MainActivity mainActivity;
    View view;

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_settings, container, false);
        //ButterKnife.bind(this, view);
        initView();
        return view;
    }

    public void initView(){
        mainActivity = (MainActivity)getActivity();

        m_back = (TextView)view.findViewById(R.id.tx_back);

        m_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tx_back:
                mainActivity.showMainFragment();
                break;
            default:
                break;
        }
    }
}
