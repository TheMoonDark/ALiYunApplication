package com.example.soulapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.soulapplication.LoginActivity;
import com.example.soulapplication.MainActivity;
import com.example.soulapplication.R;
import com.example.soulapplication.adapter.ControlAdapter;
import com.example.soulapplication.adapter.SelfAdapter;
import com.example.soulapplication.base.BaseFragment;

public class SelfFragment extends BaseFragment {
    private RecyclerView recyclerView;
    private SelfAdapter selfAdapter;
    private Button btn_login;
    @Override
    public int setResourceId() {
        return R.layout.activity_fragment_self;
    }

    @Override
    public void initView() {
        selfAdapter = new SelfAdapter(getContext());
        recyclerView = getView().findViewById(R.id.recycler_fragment_self);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(selfAdapter);
        btn_login = getView().findViewById(R.id.btn_self_login_register);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "请登录", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        super.onActivityCreated(savedInstanceState);

    }
}
