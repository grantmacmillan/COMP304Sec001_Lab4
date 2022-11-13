package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1Clicked(View v){
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void button2Clicked(View v){
        startActivity(new Intent(MainActivity.this, ApplicantActivity.class));
    }

    public void button3Clicked(View v){
        startActivity(new Intent(MainActivity.this, TestActivity.class));
    }

    public void button4Clicked(View v){
        startActivity(new Intent(MainActivity.this, ViewTestInfoActivity.class));
    }

    public void button5Clicked(View v){
        startActivity(new Intent(MainActivity.this, UpdateInfoActivity.class));
    }
}