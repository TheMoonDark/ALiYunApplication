package com.example.soulapplication.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.soulapplication.R;
import com.example.soulapplication.adapter.HomeAdapter;
import com.example.soulapplication.base.BaseFragment;

public class HomeFragment extends BaseFragment {
    private SwipeRefreshLayout swipeRefreshLayout;
    private HomeAdapter homeAdapter;
    private RecyclerView recyclerView;

    @Override
    public int setResourceId() {
        return R.layout.activity_fragment_home;
    }

    @Override
    public void initView() {
        homeAdapter = new HomeAdapter(getContext());
        recyclerView = getView().findViewById(R.id.recycler_fragment_home);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(homeAdapter);
        swipeRefreshLayout =getView().findViewById(R.id.swipe_Refresh_Layout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // do something, such as re-request from server or other
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                recyclerView.setAdapter(homeAdapter);
                swipeRefreshLayout.setRefreshing(false);
                return;
            }
        });





    }
}
