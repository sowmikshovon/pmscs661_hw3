package com.example.sbactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SBActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbactivity2);
        Intent intent = getIntent();
        TextView sports = (TextView) findViewById(R.id.textView);
        ArrayList<String> sportsList = intent.getStringArrayListExtra("sportsList");
        StringBuilder sportsFormatted = new StringBuilder();
        for (String brand : sportsList) {
            sportsFormatted.append(brand).append('\n');
        }
        sports.setText(sportsFormatted);
    }
}