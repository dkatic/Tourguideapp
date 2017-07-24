package com.example.david.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by david on 24.7.2017..
 */

public class TourGuideAppFragmentPagerAdapter extends FragmentPagerAdapter {
    Context ct;

    public TourGuideAppFragmentPagerAdapter(FragmentManager fm, Context ct) {
        super(fm);
        this.ct = ct;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1) {
            return new EatDrinkFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new MuseumsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return ct.getString(R.string.events);
        } else if (position == 1) {
            return ct.getString(R.string.eat_and_drink);
        } else if (position == 2) {
            return ct.getString(R.string.hotels);
        } else {
            return ct.getString(R.string.museums);
        }
    }
}