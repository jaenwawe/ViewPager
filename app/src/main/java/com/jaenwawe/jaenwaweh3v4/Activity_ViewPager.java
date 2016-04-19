package com.jaenwawe.jaenwaweh3v4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.HashMap;
import java.util.Locale;

public class Activity_ViewPager extends AppCompatActivity {

    //view pager variables
    MyFragmentPagerAdapter myPagerAdapter;
    ViewPager mViewPager;
    MovieData movieData;
    //private int position = 0; //  p

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        movieData = new MovieData();

        myPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), movieData.getSize());
        mViewPager = (ViewPager) findViewById(R.id.activity_pager);
        mViewPager.setAdapter(myPagerAdapter);
        mViewPager.setCurrentItem(3);
    }



}


   /* public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

        int count;

        public MyFragmentPagerAdapter (FragmentManager fm, int size){
            super(fm);
            count = size;
        }

        @Override
        public Fragment getItem(int position){
            return Fragment_MasterDetail.newInstance((HashMap<String, ?>)movieData.getItem(position));
        }

        @Override
        public int getCount(){return count;}

        @Override
        public CharSequence getPageTitle(int position){
            Locale l = Locale.getDefault();
            HashMap<String, ?> movie = (HashMap<String, ?>) movieData.getItem(position);



            return name.toUpperCase(1);
        }*/
