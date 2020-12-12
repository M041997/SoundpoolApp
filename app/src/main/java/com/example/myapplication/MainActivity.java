package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9;
    private Button button;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, " This is a practice project for a soundpool. I own none of the characters or sounds included in this app. All sounds/characters belong to their respective copyright/trademark holders.", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .build();

            soundPool = new SoundPool.Builder()
                    //Makes the sounds not overlap with each other
                    .setMaxStreams(1)
                    .setAudioAttributes(audioAttributes)
                    .build();

        } else
            soundPool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0);

        final int sound1 = soundPool.load(this, R.raw.sound1, 1);
        final int sound2 = soundPool.load(this, R.raw.sound2, 1);
        final int sound3 = soundPool.load(this, R.raw.sound3, 1);
        final int sound4 = soundPool.load(this, R.raw.sound4, 1);
        final int sound5 = soundPool.load(this, R.raw.sound5, 1);
        final int sound6 = soundPool.load(this, R.raw.sound6, 1);
        final int sound7 = soundPool.load(this, R.raw.sound7, 1);
        final int sound8 = soundPool.load(this, R.raw.sound8, 1);
        final int sound9 = soundPool.load(this, R.raw.sound9, 1);


        final android.widget.Button button1 = findViewById(R.id.sound1);
        final android.widget.Button button2 = findViewById(R.id.sound2);
        final android.widget.Button button3 = findViewById(R.id.sound3);
        final android.widget.Button button4 = findViewById(R.id.sound4);
        final android.widget.Button button5 = findViewById(R.id.sound5);
        final android.widget.Button button6 = findViewById(R.id.sound6);
        final android.widget.Button button7 = findViewById(R.id.sound7);
        final android.widget.Button button8 = findViewById(R.id.sound8);
        final android.widget.Button button9 = findViewById(R.id.sound9);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(sound1, 1, 1, 1, 0, 0);
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(sound2, 1, 1, 1, 0, 0);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(sound3, 1, 1, 1, 0, 0);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(sound4, 1, 1, 1, 0, 0);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(sound5, 1, 1, 1, 0, 0);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(sound6, 1, 1, 1, 0, 0);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound7, 1, 1, 1, 0, 0);
                                       }
                                   });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound8, 1, 1, 1, 0, 0);
                                       }
                                   });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                soundPool.play(sound9, 1, 1, 1, 0, 0);
                }
        });

    }}