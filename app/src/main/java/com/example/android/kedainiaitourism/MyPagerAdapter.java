package com.example.android.kedainiaitourism;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by lukas on 6/20/17.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fr)
    {
        super(fr);
    }
    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new LocationFragment();
        else if (position == 1)
            return new RestaurantsFragment();
        else
            return new EntertainmentFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
