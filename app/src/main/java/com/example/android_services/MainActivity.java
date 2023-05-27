package com.example.android_services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button start, stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        // assigning ID of startButton
        // to the object start
        start = findViewById( R.id.startButton );

        // assigning ID of stopButton
        // to the object stop
        stop = findViewById( R.id.stopButton );

        // declaring listeners for the
        // buttons to make them respond
        // correctly according to the process
        start.setOnClickListener(this::onClick);
        stop.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        // process to be performed
        // if start button is clicked
        if(view == start){

            // starting the service
            startService(new Intent( MainActivity.this, MainService.class ) );
        }

        // process to be performed
        // if stop button is clicked
        else if (view == stop){

            // stopping the service
            stopService(new Intent( MainActivity.this, MainService.class ) );

        }
    }
}