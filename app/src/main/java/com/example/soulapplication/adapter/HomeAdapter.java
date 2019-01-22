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

public class HomeAdapter extends RecyclerView.Adapter<HomeHolder> {
    private Context context;

    public HomeAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_fragment_home_recycler_view, viewGroup, false);
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder homeHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
