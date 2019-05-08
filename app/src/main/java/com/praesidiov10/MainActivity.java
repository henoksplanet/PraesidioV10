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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.*;
import com.android.volley.toolbox.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);

        final RequestQueue MyRequestQueue = Volley.newRequestQueue(this);

        final CardView login = findViewById(R.id.cardView1);
        final TextView register = (TextView) findViewById(R.id.register);
        final EditText password=(EditText) findViewById(R.id.password);
        final EditText username=(EditText) findViewById(R.id.username);

// ...






// Add the request to the RequestQueue.

        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent myIntent = new Intent(getBaseContext(),   Registration.class);
                startActivity(myIntent);
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String user = username.getText().toString(); //gets you the contents of edit text
                String passwd= password.getText().toString(); //gets you the contents of edit text

                String url="http://agile-scrubland-43000.herokuapp.com/?username="+user+"&password="+passwd;

                StringRequest MyStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                       if(response.equals("null")){


                       }
                       else{



                           Intent myIntent = new Intent(getBaseContext(),   UserPage.class);
                           myIntent.putExtra("username", user);
                           startActivity(myIntent);
                       }
                        //This code is executed if the server responds, whether or not the response contains data.
                        //The String 'response' contains the server's response.
                    }
                }, new Response.ErrorListener() { //Create an error listener to handle errors appropriately.
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        register.setText("error");
                        //This code is executed if there is an error.
                    }
                }) ;

                MyRequestQueue.add(MyStringRequest);



            }
        });
    }
}




