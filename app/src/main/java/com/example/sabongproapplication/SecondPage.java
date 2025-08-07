package com.example.sabongproapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondPage extends AppCompatActivity {
    public Button signupbutton;
    public Button loginbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        signupbutton = (Button) findViewById(R.id.buttonsignup);

        signupbutton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent intent = new Intent( SecondPage.this, RegisterPage.class);
                                               startActivity(intent);
                                           }
                                       }


        );

        loginbutton = (Button) findViewById(R.id.buttonlogin);

        loginbutton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent intent = new Intent( SecondPage.this, LoginActivity.class);
                                               startActivity(intent);
                                           }
                                       }


        );
    }
}
