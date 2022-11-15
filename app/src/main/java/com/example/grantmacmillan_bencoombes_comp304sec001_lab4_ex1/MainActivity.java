package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppDao dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dao = AppDatabase.getInstance(this).appDao();

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

    public void PopulateExaminers() {
        Examiner examiner = new Examiner(1, "Ben", "Coombes", "Markham", "1234");
        Examiner examiner1 = new Examiner(2, "Grant", "MacMillan", "Stouffville", "1234");
        dao.insertExaminer(examiner);
        dao.insertExaminer(examiner1);
    }
}