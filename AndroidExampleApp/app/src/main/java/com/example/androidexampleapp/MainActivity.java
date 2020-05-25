package com.example.androidexampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private void setToggleMsgListener(Button btn) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Log to see if button is responding to clicks at all.
                Log.i("btnToggleMessage", "Button Clicked. Message visibility is toggled");

                TextView helloMsg = findViewById(R.id.textView);

                /* Toggle "Hello World" Message.
                 * Can't simply use ! to toggle the Visibility because it's an int not a bool.
                 */
                if (helloMsg.getVisibility() == View.INVISIBLE) {
                    helloMsg.setVisibility(View.VISIBLE);
                }
                else {
                    helloMsg.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define button to hide Hello Message
        Button btnToggleMsg = findViewById(R.id.btnToggleMsg);
        // Set listener
        setToggleMsgListener(btnToggleMsg);

        // Define list to display cities
        TextView lstExample = findViewById(R.id.listExample);

        // Populate the list with cities found from ListItems.java
        for (String city : ListItems.getCities()) {
            //Add 3 line breaks between the cities
            lstExample.append(city + "\n\n\n");
        }

        // TODO: eventually connect to the internet to show that functionality also.
    }

}
