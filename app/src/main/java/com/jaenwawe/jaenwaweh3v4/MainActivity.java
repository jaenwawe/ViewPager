package com.jaenwawe.jaenwaweh3v4;

import android.app.FragmentTransaction;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements  Fragment_FrontPage.OnFragmentInteractionListener {



    public void onFragmentInteraction(int fragment){
//for task 2 and 3 load activities.


        switch (fragment) {
            case 1:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container_main, Fragment_AboutMe.newInstance("1", "2"))
                        .commit();
                break;

      /*      case 2:
                setContentView(R.layout.activity__view_pager);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container_view_pager, Fragment_ViewPager.newInstance("1", "2"))
                        .commit();
                break;

            case 3:
                setContentView(R.layout.activity_master_details);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container_master_details, Fragment_MasterDetail.newInstance("1", "2"))
                        .commit();
                break;*/
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final FragmentTransaction ft =
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_main, Fragment_FrontPage.newInstance(R.id.fragment_front_page))
                .addToBackStack(null)
                .commit();
    }
}
