package com.praesidiov10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BedroomOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        setContentView(R.layout.activity_bedroom_one);
    }
}
