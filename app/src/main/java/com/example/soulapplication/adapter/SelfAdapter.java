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

public class SelfAdapter extends RecyclerView.Adapter<SelfHolder> {
    private Context context;

    public SelfAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public SelfHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_fragment_self_recycler_view, viewGroup, false);

        return new SelfHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelfHolder selfHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
