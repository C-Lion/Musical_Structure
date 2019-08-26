package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class RecentlyPlayed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

        //onClick listener for openPlayer activity
        //First find the View that shows the Player activity link area:
        TextView recent_back_to_home = (TextView) findViewById(R.id.recent_back_to_home);
        // Set a click listener on the player TextView
        recent_back_to_home.setOnClickListener(new View.OnClickListener() {
            //The method that executes when the Play Now TextView is clicked on:
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //onClick listener for openPlayerFromRecents in Recently Played activity
        //First find the View that shows the Player activity link area:
        TextView open_player_from_recents = (TextView) findViewById(R.id.open_player_from_recents);
        // Set a click listener on the player TextView
        open_player_from_recents.setOnClickListener(new View.OnClickListener() {
            //The method that executes when the openPlayerInMedia TextView is clicked on:
            @Override
            public void onClick(View view) {
                Intent openPlayerActivity = new Intent(RecentlyPlayed.this, PlaySong.class);
                startActivity(openPlayerActivity);
            }
        });


    }
}
