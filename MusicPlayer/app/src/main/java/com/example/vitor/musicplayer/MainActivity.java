package com.example.vitor.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.hotel_california);
        Button playButton = (Button) findViewById(R.id.play_button);
        Button pauseButton = (Button) findViewById(R.id.pause_button);

        // Set a click listener on that Button
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();

            }
        });

        // Set a click listener on that Button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
