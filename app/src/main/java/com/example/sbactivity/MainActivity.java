package com.example.sbactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private SportsExpert expert = new SportsExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSearchTeam (View view) {
        Intent intent = new Intent(this, SBActivity2.class);
        Spinner sports = findViewById(R.id.Spinner);
        String sportsType = String.valueOf(sports.getSelectedItem());
        ArrayList<String> sportsList = expert.getBrands(sportsType);
        intent.putStringArrayListExtra("sportsList", sportsList);
        startActivity(intent);
    }
}