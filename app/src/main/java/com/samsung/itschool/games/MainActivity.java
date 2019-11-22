package com.samsung.itschool.games;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView game;
    Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = findViewById(R.id.film);
        change = findViewById(R.id.change);

    }

    public void changeFilm(View v){
        Resources res = getResources();
        String [] games = res.getStringArray(R.array.games);
        Random random = new Random();
        int n = random.nextInt(games.length);
        game.setText(games[n]);
    }
}
