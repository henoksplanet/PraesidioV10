package com.praesidiov10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Splash extends AppCompatActivity {
    static final int READ_BLOCK_SIZE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

            Intent myIntent = new Intent(getBaseContext(),  MainActivity.class);
            startActivity(myIntent);
            finish();



    }
}
