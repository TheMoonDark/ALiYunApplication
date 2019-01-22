package com.example.soulapplication.adapter;
/**
 * Created by 郝德琛 haodechen
 */
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.soulapplication.R;
import com.example.soulapplication.base.GlideImageLoader;
import com.example.soulapplication.bean.HomeProject;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class HomeHolder extends RecyclerView.ViewHolder {
    private List<Integer> images = new ArrayList<>();
    private Banner banner;

    public HomeHolder(@NonNull View itemView) {
        super(itemView);
        images.add(R.mipmap.ad1);
        images.add(R.mipmap.ad2);
        images.add(R.mipmap.ad3);
        images.add(R.mipmap.ad4);
        images.add(R.mipmap.ad5);

        banner = itemView.findViewById(R.id.banner);
        banner.setBannerStyle(BannerConfig.NOT_INDICATOR);
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(images);
        banner.setBannerAnimation(Transformer.DepthPage);
        banner.isAutoPlay(true);
        banner.setDelayTime(1500);
        banner.setIndicatorGravity(BannerConfig.CENTER);
        banner.start();




    }
}
