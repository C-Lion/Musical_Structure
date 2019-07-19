package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaySong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        //onClick listener for openMediaCategory from the Select from Library Button
        // Find the View that shows the media category activity
        TextView goToMediaCatalogButton = (TextView) findViewById(R.id.goToMediaCatalogButton);
        // Set a click listener on media view
        goToMediaCatalogButton.setOnClickListener(new View.OnClickListener() {
            //Code to run when select media catalog is clicked on
            @Override
            public void onClick(View view) {
                Intent openMediaCatalog = new Intent(getApplicationContext(), MediaCategories.class);
                startActivity(openMediaCatalog);
            }
        });
        
        //onClick listener for Return to Home Button
        //First find the View that shows the Return to Home activity link area:
        TextView PlayerBackToHomeButton = (TextView) findViewById(R.id.PlayerBackToHomeButton);
        // Set a click listener on the player TextView
        PlayerBackToHomeButton.setOnClickListener(new View.OnClickListener() {
            //The method that executes when the Play Now TextView is clicked on:
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}
