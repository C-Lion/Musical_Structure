package com.example.musicplayer;

import android.content.Intent;
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

        //onClick listener for Return to Home activity
        //First find the View that shows the Return to Home activity link area:
        TextView media_back_to_home = (TextView) findViewById(R.id.media_back_to_home);
        // Set a click listener on the player TextView
        media_back_to_home.setOnClickListener(new View.OnClickListener() {
            //The method that executes when the Play Now TextView is clicked on:
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //onClick listener for openPlayerFromMedia in Media activity
        //First find the View that shows the Player activity link area:
        TextView open_player_from_media = (TextView) findViewById(R.id.open_player_from_media);
        // Set a click listener on the player TextView
        open_player_from_media.setOnClickListener(new View.OnClickListener() {
            //The method that executes when the openPlayerInMedia TextView is clicked on:
            @Override
            public void onClick(View view) {
                Intent openPlayerActivity = new Intent(MediaCategories.this, PlaySong.class);
                startActivity(openPlayerActivity);
            }
        });


    }
}
