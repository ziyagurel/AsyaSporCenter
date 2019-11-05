package com.zahitziyagurel.asyasporcenter.Activity;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zahitziyagurel.asyasporcenter.Adapter.satis_tabbed_adapter;
import com.zahitziyagurel.asyasporcenter.R;

public class SatisEkrani extends AppCompatActivity {

    private String TAG = getClass().getName();
    satis_tabbed_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tabbet_satis);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Home Screen BackKey
        final ViewPager viewPager= findViewById(R.id.satis_viewpager);
        adapter = new satis_tabbed_adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.satis_tabs);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
