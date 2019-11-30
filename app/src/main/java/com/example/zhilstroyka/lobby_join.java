package com.example.zhilstroyka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lobby_join extends AppCompatActivity {

    //Variables
    TextView txtEmailAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby_join);

        txtEmailAddress = findViewById(R.id.txtCodeNumbers);

        txtEmailAddress.setText(getIntent().getStringExtra("code"));


    }

    public void onClick(View view) {
        Intent intent = new Intent(lobby_join.this, TypesGamesActivity.class);
        startActivity(intent);
    }
}
