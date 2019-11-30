package com.example.zhilstroyka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CodeScanningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_scanning);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Camera_Activity.class);
        startActivity(intent);
    }

}
