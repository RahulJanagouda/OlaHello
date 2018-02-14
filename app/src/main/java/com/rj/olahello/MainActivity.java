package com.rj.olahello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AVLoadingIndicatorView indicator = findViewById(R.id.indicator);
        indicator.setIndicator(new LineScalePulseOutRapidIndicator());
        indicator.setIndicatorColor(getResources().getColor(R.color.loaderColor));

    }
}
