package com.example.project_mockups;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("message", "onCreate() has executed...");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message", "onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message", "onResume() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message", "onPause() has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message", "onStop() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message", "onDestroy() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message", "onRestart() has executed...");
    }



    public void displayActivity2(View v){
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }
}
