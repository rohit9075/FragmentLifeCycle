package com.rohit.android.firstfragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment {


    public static final String FRAGMENT_TAG = "fragment_tag";

    public SimpleFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(FRAGMENT_TAG, "onAttach: ");
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(FRAGMENT_TAG, "onCreate: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(FRAGMENT_TAG, "onResume: ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d(FRAGMENT_TAG, "onCreateView: ");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(FRAGMENT_TAG, "onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(FRAGMENT_TAG, "onStop: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(FRAGMENT_TAG, "onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(FRAGMENT_TAG, "onDetach: ");
    }
}
