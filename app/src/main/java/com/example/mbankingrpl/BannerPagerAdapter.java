package com.example.mbankingrpl;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class BannerPagerAdapter extends FragmentPagerAdapter {

    private int[] imageResources = {R.drawable.cashback, R.drawable.cashback2, R.drawable.promo2};

    public BannerPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return new benner(imageResources[position]);
    }

    @Override
    public int getCount() {
        return imageResources.length;
    }
}
