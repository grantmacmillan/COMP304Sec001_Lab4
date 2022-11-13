package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {

    EditText testID;
    EditText applicantID;
    EditText examinerID;
    EditText testResult;
    EditText testDate;
    EditText testRoute;
    EditText testType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        testID = findViewById(R.id.testID);
        applicantID = findViewById(R.id.applicantID);
        examinerID = findViewById(R.id.examinerID);
        testResult = findViewById(R.id.testResult);
        testDate = findViewById(R.id.testDate);
        testRoute = findViewById(R.id.testRoute);
        testType = findViewById(R.id.testType);
    }

    public void EnterClicked(View v){

    }
}