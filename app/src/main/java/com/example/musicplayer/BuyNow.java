package com.example.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BuyNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_now);

        //onClick listener for Buy More Songs Opps Not ready yet Textview
        //First find the View that shows the Return to Home activity link area:
        TextView NotReadyToPay = (TextView) findViewById(R.id.NotReadyToPay);
        // Set a click listener on the player TextView
        NotReadyToPay.setOnClickListener(new View.OnClickListener() {
            //The method that executes when the Play Now TextView is clicked on:
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
