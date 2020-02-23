package com.rohit.android.firstfragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String FRAGMENT_TAG = "fragment_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(FRAGMENT_TAG, "onCreate: Activity called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(FRAGMENT_TAG, "onStart: Activity called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(FRAGMENT_TAG, "onResume: Activity called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(FRAGMENT_TAG, "onPause: Activity called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(FRAGMENT_TAG, "onStop: Activity called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(FRAGMENT_TAG, "onDestroy: Activity called");
    }

    public void addClickHandler(View view) {
        SimpleFragment fragment = new SimpleFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.fragment_container, fragment, FRAGMENT_TAG)
                .commit();
    }

    public void removeClickHandler(View view) {

        Fragment fragment =
                getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_TAG);
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }


}
