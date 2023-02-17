package com.example.datingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.prefs.Preferences;

public class Questions_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_page);
    }
    public void onClickLogIn(View v){
        Intent intent = new Intent(this, Preferences.class);
        startActivity(intent);
    }
}