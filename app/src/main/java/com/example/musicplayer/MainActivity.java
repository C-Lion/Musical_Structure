package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //onClick listener for openPlayer activity
        //First find the View that shows the Player activity link area:
        TextView player = (TextView) findViewById(R.id.player);
        // Set a click listener on the player TextView
        player.setOnClickListener(new View.OnClickListener() {
            //The method that executes when the Play Now TextView is clicked on:
            @Override
            public void onClick(View view) {
                Intent openPlayerActivity = new Intent(MainActivity.this, PlaySong.class);
                startActivity(openPlayerActivity);
            }
        });

        //onClick listener for openMediaCategory activity
        // Find the View that shows the media category activity
        TextView media = (TextView) findViewById(R.id.media);
        // Set a click listener on media view
        media.setOnClickListener(new View.OnClickListener() {
            //Code to run when select media catalog is clicked on
            @Override
            public void onClick(View view) {
                Intent openMediaCatalog = new Intent(MainActivity.this, MediaCategories.class);
                startActivity(openMediaCatalog);
            }
        });


        //onClick listener for the Buy Now activity
        // Find the View that shows the Buy category
        TextView buyNow = (TextView) findViewById(R.id.buy);
        // Set a click listener on Buy Now Activity
        buyNow.setOnClickListener(new View.OnClickListener() {
            //Code to run when the Buy Now TextView is clicked on
            @Override
            public void onClick(View view) {
                Intent openbuyNow = new Intent(MainActivity.this, BuyNow.class);
                startActivity(openbuyNow);
            }
        });

        //onClick listener for open Recently Played activity
        // Find the View that shows the Recently Played activity
        TextView recents = (TextView) findViewById(R.id.recent);
        // Set a click listener on Recently Played TextView
        recents.setOnClickListener(new View.OnClickListener() {
            //Code to run when the Recently Played TextView is clicked on
            @Override
            public void onClick(View view) {
                Intent openRecentlyPlayed = new Intent(MainActivity.this, RecentlyPlayed.class);
                startActivity(openRecentlyPlayed);
            }
        });
    }
}
