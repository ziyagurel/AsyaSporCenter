package com.zahitziyagurel.asyasporcenter.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.zahitziyagurel.asyasporcenter.Fragment.fragment_urun;

public class satis_tabbed_adapter extends FragmentStatePagerAdapter {
    private fragment_urun fr_urun=null;
    private String TAG = getClass().getName();

    public satis_tabbed_adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            if(fr_urun == null){
                fr_urun = new fragment_urun();
            }
            return fr_urun;
        }
        else
            Log.d(TAG, "getItem: " + i);
        return null;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
