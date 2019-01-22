package com.example.soulapplication.base;
/**
 * Created by 郝德琛 haodechen
 */
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {
    private View view;
    public abstract int setResourceId();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(setResourceId(), container, false);
        initView();
        return view;
    }

    public View getView(){
        return view;
    }

    public abstract void initView();


}
