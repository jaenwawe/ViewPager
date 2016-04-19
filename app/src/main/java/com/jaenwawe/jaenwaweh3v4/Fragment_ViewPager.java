package com.jaenwawe.jaenwaweh3v4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_ViewPager extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public Fragment_ViewPager() {
        // Required empty public constructor
    }
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //private OnFragmentInteractionListener mListener;

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(int position);
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_AboutMe.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_ViewPager newInstance(String param1, String param2) {
        Fragment_ViewPager fragment = new Fragment_ViewPager();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment__view_pager, container, false);

        final TextView textView = (TextView) rootView.findViewById(R.id.fvp_textview);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View view) {
                int total;
                total = 0;
                textView.setText("Clicked" + (++total) + "times.");
            }
        });
        return rootView;
    }

}
