package com.example.soulapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.soulapplication.base.BaseFragment;
import com.example.soulapplication.base.GlideImageLoader;
import com.example.soulapplication.fragment.CloudFragment;
import com.example.soulapplication.fragment.ControlFragment;
import com.example.soulapplication.fragment.HomeFragment;
import com.example.soulapplication.fragment.SelfFragment;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by 郝德琛 haodechen
 */
public class MainActivity extends AppCompatActivity {

    private BaseFragment[] fragments = {new HomeFragment(), new ControlFragment(), new CloudFragment(), new SelfFragment()};
    private FragmentManager fragmentManager = getSupportFragmentManager();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentManager.beginTransaction().replace(R.id.container_fragment, fragments[0]).commit();
                    return true;
                case R.id.navigation_control:
                    fragmentManager.beginTransaction().replace(R.id.container_fragment, fragments[1]).commit();
                    return true;
                case R.id.navigation_cloud:
                    fragmentManager.beginTransaction().replace(R.id.container_fragment, fragments[2]).commit();
                    return true;
                case R.id.navigation_self:
                    fragmentManager.beginTransaction().replace(R.id.container_fragment, fragments[3]).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentManager.beginTransaction().add(R.id.container_fragment, fragments[0]).commit();

        fragmentManager.beginTransaction().add(R.id.container_fragment, fragments[1]).commit();
        fragmentManager.beginTransaction().add(R.id.container_fragment, fragments[2]).commit();
        fragmentManager.beginTransaction().add(R.id.container_fragment, fragments[3]).commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
