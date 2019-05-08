package com.praesidiov10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.w3c.dom.Text;
import org.json.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UserPage extends AppCompatActivity {

    static final int READ_BLOCK_SIZE = 100;
    static String dContainer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        final CardView livingroom=findViewById(R.id.livingroom);
        final CardView bedroom1=findViewById(R.id.bedroom1);
        final CardView bedroom2=findViewById(R.id.bedroom2);
        final CardView logout=findViewById(R.id.logout);


        Intent intent = getIntent();
        final String message = intent.getStringExtra("username");



        livingroom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent myIntent = new Intent(getBaseContext(),   LivingRoom.class);
                startActivity(myIntent);
            }
        });

        bedroom1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent myIntent = new Intent(getBaseContext(),   BedroomOne.class);
                startActivity(myIntent);
            }
        });

        bedroom2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent myIntent = new Intent(getBaseContext(),   BedroomTwo.class);
                startActivity(myIntent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent myIntent = new Intent(getBaseContext(),   MainActivity.class);
                startActivity(myIntent);
            }
        });





       /* final TextView username = (TextView) findViewById(R.id.username);
        final TextView result = (TextView) findViewById(R.id.result);
        Button read = (Button) findViewById(R.id.read);
        Button write = (Button) findViewById(R.id.write);
        final TextView firstname = (TextView) findViewById(R.id.firstname);
        final TextView lastname = (TextView) findViewById(R.id.lastname);
        final TextView last_updated = (TextView) findViewById(R.id.last_updated);
        TextView room_1_temp = (TextView) findViewById(R.id.room_1_temp);

        final RequestQueue MyRequestQueue = Volley.newRequestQueue(this);

        String url="http://henoktad.atwebpages.com/read.php?username="+message;

        StringRequest MyStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                 try {
                     JSONObject jObject = new JSONObject(response);

                     String firstnameS = jObject.getString("firstname");
                     firstname.setText("firstname:"+firstnameS);
                     String lastnameS = jObject.getString("lastname");
                     lastname.setText("lastname:"+lastnameS);
                     String last_updatedS = jObject.getString("last_updated");
                     last_updated.setText("last_updated:"+last_updatedS);

                 }
                 catch(JSONException e){

                 }




                //This code is executed if the server responds, whether or not the response contains data.
                //The String 'response' contains the server's response.
            }
        }, new Response.ErrorListener() { //Create an error listener to handle errors appropriately.
            @Override
            public void onErrorResponse(VolleyError error) {

                //This code is executed if there is an error.
            }
        }) ;

        MyRequestQueue.add(MyStringRequest);


     /*   read.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                //reading text from file
                try {
                    FileInputStream fileIn=openFileInput("username.txt");
                    InputStreamReader InputRead= new InputStreamReader(fileIn);

                    char[] inputBuffer= new char[READ_BLOCK_SIZE];
                    String s="";
                    int charRead;

                    while ((charRead=InputRead.read(inputBuffer))>0) {
                        // char to string conversion
                        String readstring=String.copyValueOf(inputBuffer,0,charRead);
                        s +=readstring;
                    }
                    InputRead.close();
                    result.setText(s);
                    //Toast.makeText(getBaseContext(), s,Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        write.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                try {
                    FileOutputStream fileout=openFileOutput("username.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
                    outputWriter.write("");
                    outputWriter.close();

                    //display file saved message
                    Toast.makeText(getBaseContext(), "",
                            Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
*/






    }




}


