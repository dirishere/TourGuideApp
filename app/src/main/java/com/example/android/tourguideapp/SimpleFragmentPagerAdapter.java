package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    private String tabTitles[] = new String[]{"About.", "People.", "Places.", "Nature."};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment();
        } else if (position == 1) {
            return new PeopleFragment();
        } else if (position == 2) {
            return new PlacesFragment();
        } else {
            return new NatureFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}

