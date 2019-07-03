package com.example.project_mockups;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity5 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    public void displayActivity4(View v){
        Intent i = new Intent(this,Activity4.class);
        startActivity(i);
    }

    public void displayActivity1(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
