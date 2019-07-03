package com.example.project_mockups;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void displayActivity1(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void displayActivity3(View v){
        Intent i = new Intent(this, Activity3.class);
        startActivity(i);
    }


}
