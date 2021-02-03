package com.example.fragmenttesting;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {



    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment k = null;
        switch (position){
            case 0:
                k = new RedFragment();
                break;
            case 1:
                k = new GreenFragment();
                break;
            case 2:
                k = new BlueFragment();
                break;
            case 3:
                k = new YellowFragment();
                break;
            case 4:
                k = new BrownFragment();
                break;
        }
        return k;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
