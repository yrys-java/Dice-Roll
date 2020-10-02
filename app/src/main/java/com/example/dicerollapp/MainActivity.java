package com.example.dicerollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageView imageView2;
    private Random diceRoll = new Random();
    private Random diceRoll2 = new Random();
    int random = 0;
    int random2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        if (savedInstanceState != null) {
          random = savedInstanceState.getInt("ran1");
          random2 = savedInstanceState.getInt("ran2");
          getRandom(random);
          getRandom2(random2);

        }
   }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("ran1", random);
        outState.putInt("ran2", random2);


    }

    public void button(View view) {
        dice();
    }

    public void dice() {
        random = diceRoll.nextInt(6) + 1;
        getRandom(random);


        random2 = diceRoll2.nextInt(6) + 1;
        getRandom2(random2);


    }

    private void getRandom2(int random2) {
        switch (random2) {
            case 1:
                imageView2.setImageResource(R.drawable.photo_1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.photo_2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.photo_3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.photo_4);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.photo_5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.photo_6);
                break;
        }
    }

    private void getRandom(int random) {

        switch (random) {
            case 1:
                imageView.setImageResource(R.drawable.photo_1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.photo_2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.photo_3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.photo_4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.photo_5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.photo_6);
                break;
        }
    }


}