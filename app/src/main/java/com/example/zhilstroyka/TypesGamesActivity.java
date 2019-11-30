package com.example.zhilstroyka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TypesGamesActivity extends AppCompatActivity {

    Button btn_single_game, btn_online_game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_games);

        btn_single_game = findViewById(R.id.button_single_game);
        btn_online_game = findViewById(R.id.button_online_game);

        btn_single_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypesGamesActivity.this, SingleGameActivity.class);
                startActivity(intent);
            }
        });

        btn_online_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypesGamesActivity.this, OnlineGameActivity.class);
                startActivity(intent);
            }
        });

    }


}
