package com.example.sabongproapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    FirebaseFirestore firestore;

    public Button startbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Map<String,Object> users = new HashMap<>();
        users.put(k:"firstName", v: "EASY");
        users.put(k:"lastName", v: "TUTO");
        users.put(k:"Description", v: "UWU");


        startbutton = (Button) findViewById(R.id.startbutton);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, SecondPage.class);
                startActivity(intent);
            }
                                  }


        );
    }




}





