package com.devfest.its.its_devfest.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devfest.its.its_devfest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobFragment extends Fragment {


    public JobFragment() {
        // Required empty public constructor
    }
    public static JobFragment newInstance(){
        JobFragment jobFragment = new JobFragment();
        return jobFragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_job, container, false);
        return  view;
    }

}
