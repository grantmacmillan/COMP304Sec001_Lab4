package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1Clicked(View v) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
    public void button2Clicked(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        if(sharedPreferences.getInt("examinerId", 0) != 0) {
            startActivity(new Intent(MainActivity.this, ApplicantActivity.class));
        } else {
            Toast.makeText(this, "Please Login", Toast.LENGTH_SHORT).show();
        }
    }

    public void button3Clicked(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        if(sharedPreferences.getInt("examinerId", 0) != 0) {
            startActivity(new Intent(MainActivity.this, TestActivity.class));
        } else {
            Toast.makeText(this, "Please Login", Toast.LENGTH_SHORT).show();
        }
    }

    public void button4Clicked(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        if(sharedPreferences.getInt("examinerId", 0) != 0) {
            startActivity(new Intent(MainActivity.this, ViewTestInfoActivity.class));
        } else {
            Toast.makeText(this, "Please Login", Toast.LENGTH_SHORT).show();
        }
    }

    public void button5Clicked(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        if(sharedPreferences.getInt("examinerId", 0) != 0) {
            startActivity(new Intent(MainActivity.this, UpdateInfoActivity.class));
        } else {
            Toast.makeText(this, "Please Login", Toast.LENGTH_SHORT).show();
        }
    }
}