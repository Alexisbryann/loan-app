package com.example.loginusingsharedpreferences;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        if (position == 0) {
            fragment = new ProductGridFragment();
        }else if (position == 1){
            fragment = new Fragment();
        }else if (position == 2){
            fragment = new Fragment();
        }else if (position == 3){
            fragment = new Fragment();
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position==0){
            title = "";
        }
            else if (position==1) {
            title = "";
        }
            else if (position==2){
                title = "";
        }
        return title;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
