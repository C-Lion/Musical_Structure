package com.example.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MediaCategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Sets content of the activity to use activity_media_categories.xml layout file
        setContentView(R.layout.activity_media_categories);

        //onClick listener for openPlayer activity
        //First find the View that shows the Player activity link area:
        TextView player = (TextView) findViewById(R.id.MediaBackToHome);
        // Set a click listener on the player TextView
        player.setOnClickListener(new View.OnClickListener() {
            //The method that executes when the Play Now TextView is clicked on:
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
