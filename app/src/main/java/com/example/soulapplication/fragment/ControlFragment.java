package com.example.soulapplication.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.soulapplication.R;
import com.example.soulapplication.adapter.ControlAdapter;
import com.example.soulapplication.base.BaseFragment;

public class ControlFragment extends BaseFragment {
    private RecyclerView recyclerView;
    private ControlAdapter controlAdapter;
    @Override
    public int setResourceId() {
        return R.layout.activity_fragment_control;
    }

    @Override
    public void initView() {
        controlAdapter = new ControlAdapter(getContext());
        recyclerView = getView().findViewById(R.id.recycler_fragment_control);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(controlAdapter);

    }
}
