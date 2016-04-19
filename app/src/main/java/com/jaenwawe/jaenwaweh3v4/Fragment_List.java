package com.jaenwawe.jaenwaweh3v4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

import com.jaenwawe.jaenwaweh3v4.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_List extends Fragment {


    public Fragment_List() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__list, container, false);
    }

    public static Fragment_List newInstance() {
        Fragment_List fragment = new Fragment_List();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public interface OnListItemsSelectedListener{
        public void onListItemsSelectedListener  (int position, HashMap<String, ?> movie);

    }


}
