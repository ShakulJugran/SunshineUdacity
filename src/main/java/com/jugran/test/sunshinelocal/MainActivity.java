package com.jugran.test.sunshinelocal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    private static final String FORECASTFRAGMENT_TAG = "ForecastFragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.listview_forecast, new ForecastFragment(), FORECASTFRAGMENT_TAG)
                    .commit();
        }*/
    }

}
