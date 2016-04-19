
package com.jaenwawe.jaenwaweh3v4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

        import android.support.v4.app.FragmentManager;

import java.util.HashMap;
import java.util.Locale;


/**
 * Created by Jae Nwawe on 2/21/2016.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

int count;

    MovieData movieData;

    public MyFragmentPagerAdapter (FragmentManager fm, int size){
        super(fm);
        count = size;
    }

    @Override
    public Fragment getItem(int position){
        movieData = new MovieData();
        return Fragment_MasterDetail.newInstance((HashMap<String, ?>)movieData.getItem(position));
    }

    @Override
    public int getCount(){return count;}

    @Override
    public CharSequence getPageTitle(int position){
        Locale l = Locale.getDefault();
        HashMap<String, ?> movie = (HashMap<String, ?>) movieData.getItem(position);
        String name = (String) movie.get("name");
        return name.toUpperCase(l);
    }

}

