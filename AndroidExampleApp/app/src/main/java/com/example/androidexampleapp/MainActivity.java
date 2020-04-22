package com.example.androidexampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private void setHideMsgListener(Button btn) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Log to see if button is responding to clicks at all.
                Log.i("btnHideMessage", "Button Clicked. Message should now be hidden");

                // Hide Hello World Message
                findViewById(R.id.textView).setVisibility(View.INVISIBLE);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define button to hide Hello Message
        Button btnHideMsg = findViewById(R.id.btnHideMsg);
        // Set listener
        setHideMsgListener(btnHideMsg);

        // TODO: add list to display to show scrolling through a list functionality.
        // TODO: eventually connect to the internet to show that functionality also.
    }

}
