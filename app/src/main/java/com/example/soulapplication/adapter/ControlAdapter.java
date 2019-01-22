package com.example.soulapplication.adapter;
/**
 * Created by 郝德琛 haodechen
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.soulapplication.R;

public class ControlAdapter extends RecyclerView.Adapter<ControlHolder> {
    private Context context;

    public ControlAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ControlHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_fragment_control_recycler_view, viewGroup, false);

        return new ControlHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ControlHolder controlHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
