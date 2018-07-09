package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

public class FragmentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Favorites", "Concerts", "Dining", "Venues" };
    private Context context;


    public FragmentAdapter (FragmentManager frag) {
        super(frag);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FavoritesFragment();
        } else if (position == 1) {
            return new ConcertsFragment();
        } else if (position == 2) {
            return new DiningFragment();
        } else if (position == 3) {
            return new VenuesFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
