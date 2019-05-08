package com.praesidiov10;

import android.content.Intent;
import android.view.View;
import 	android.support.v7.widget.CardView;

import java.io.*;
import java.net.URL;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.net.HttpURLConnection;
import java.io.IOException;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.*;
import com.android.volley.toolbox.*;
public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CardView login = findViewById(R.id.cardView1);
        final TextView textView = (TextView) findViewById(R.id.textView2);
// ...

// Instantiate the RequestQueue.
    /*    RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://henoktad.rf.gd/reg.php";

// Request a string response from the provided URL.

            StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            // Display the first 500 characters of the response string.
                            textView.setText("Response is: " + response.substring(0, 500));
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    textView.setText("That didn't work!");
                }
            });
        }
*/

// Add the request to the RequestQueue.

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent myIntent = new Intent(getBaseContext(),   Registration.class);
                startActivity(myIntent);
            }
        });
    }
}




