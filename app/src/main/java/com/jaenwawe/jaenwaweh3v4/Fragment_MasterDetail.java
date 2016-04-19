package com.jaenwawe.jaenwaweh3v4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.HashMap;

public class Fragment_MasterDetail extends Fragment {

    MovieData movieData = new MovieData();
    ImageView movieImage;
    TextView movieNameTV;
    TextView movieDescTV;
    TextView movieYearTV;
    RatingBar movieRatingTV;
   TextView  movieStarsTV;


 //   (HashMap<String, ?>)movieData.getItem(position)
     int position = 0;
    HashMap<String, ?> ARG_PARAM1 = (HashMap<String, ?>)movieData.getItem(position);
    private static final String ARG_PARAM2 = "param2";

    public Fragment_MasterDetail() {}

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        if (getArguments() != null) {

        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //movieData = new MovieData();
        //HashMap movie = movieData.getItem(HashMap<String, ?>movie);
        HashMap movie = (HashMap<String, ?>)getArguments().getSerializable(ARG_PARAM2);


        int imageId = (Integer)movie.get("image");
        String movieName = (String)movie.get("name");
        String movieYearString = (String)movie.get("year");
        String movieDescString = (String)movie.get("description");
        double  movieRatingNum = (Double)movie.get("rating");
        String movieStarsString = (String)movie.get("stars");

        View view =  inflater.inflate(R.layout.fragment_master_detail, container, false);

        //configure xml objects
        movieNameTV = (TextView) view.findViewById(R.id.movieTitle);
        movieImage = (ImageView) view.findViewById(R.id.movieImage);
        movieDescTV = (TextView) view.findViewById(R.id.movieDescription);
        movieYearTV = (TextView) view.findViewById(R.id.movieYear);
       movieRatingTV = (RatingBar) view.findViewById(R.id.ratingBar);
        movieStarsTV = (TextView) view.findViewById(R.id.movieStars);

        //set XML objects to values in MovieData hashmap
        movieNameTV.setText(movieName);
        movieImage.setImageResource(imageId);
        movieDescTV.setText(movieDescString);
        movieYearTV.setText(movieYearString);
        movieRatingTV.setRating((float)(movieRatingNum/2));
        movieStarsTV.setText(movieStarsString);

        return view;
    }


    public static Fragment_MasterDetail newInstance(HashMap<String, ?> movie) {
        Fragment_MasterDetail fragment = new Fragment_MasterDetail();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM2,movie);
        fragment.setArguments(args);
        return fragment;
    }

   /* public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(int position);
    }*/
}

// //  How to change args.putString(ARG_PARAM1, param1); on line 74 into args.putHashMap(ARG_PARAM1)