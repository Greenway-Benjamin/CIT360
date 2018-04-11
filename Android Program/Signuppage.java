package com.example.daddy.fehtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import static com.example.daddy.fehtracker.MainActivity.url;

public class Signuppage extends AppCompatActivity {

    Button submit;
    String username;
    String password;
    EditText user;
    EditText pass;
    TextView textview1;
    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        submit = (Button) findViewById(R.id.button3);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                user = findViewById(R.id.editText);
                pass = findViewById(R.id.editText2);
                username = user.getText().toString();
                password = pass.getText().toString();

                Signup newUser = new Signup();
                newUser.execute(username, password);


            }

        });


    }
}
