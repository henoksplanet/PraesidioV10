package com.praesidiov10;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.*;
import com.android.volley.toolbox.*;
public class Registration extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.registration);

        final Button register = findViewById(R.id.register);

        final EditText username=(EditText) findViewById(R.id.username);
        final EditText firstname=(EditText) findViewById(R.id.firstname);
        final EditText lastname=(EditText) findViewById(R.id.lastname);
        final EditText password=(EditText) findViewById(R.id.password);
        final EditText email=(EditText) findViewById(R.id.email);
        final EditText deviceID=(EditText) findViewById(R.id.deviceId);


        final RequestQueue MyRequestQueue = Volley.newRequestQueue(this);



        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String username_= username.getText().toString(); //gets you the contents of edit text
                String firstname_= firstname.getText().toString(); //gets you the contents of edit text
                final String lastname_  = lastname.getText().toString(); //gets you the contents of edit text
                String password_= password.getText().toString(); //gets you the contents of edit text
                final String email_ = email.getText().toString(); //gets you the contents of edit text
                String deviceID_= password.getText().toString(); //gets you the contents of edit text

                String url="http://agile-scrubland-43000.herokuapp.com/register?username="+username_+"&firstname="+firstname_+"&lastname="+lastname_+"&password="+password_+"&email="+email_+"&deviceId="+deviceID_;

                StringRequest MyStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


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
