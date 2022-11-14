package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    AppDao dao;
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
        dao = AppDatabase.getInstance(this).appDao();
        testID = findViewById(R.id.testID);
        applicantID = findViewById(R.id.applicantID);
        examinerID = findViewById(R.id.examinerID);
        testResult = findViewById(R.id.testResult);
        testDate = findViewById(R.id.testDate);
        testRoute = findViewById(R.id.testRoute);
        testType = findViewById(R.id.testType);
    }

    public void EnterClicked(View v){
        int tId = Integer.parseInt(testID.getText().toString());
        int aId = Integer.parseInt(applicantID.getText().toString());
        int eId = Integer.parseInt(examinerID.getText().toString());
        String tResult = testResult.getText().toString();
        String tD = testDate.getText().toString();
        String tRoute = testRoute.getText().toString();
        String tT = testType.getText().toString();

        Test test = new Test(tId, aId, eId, tResult, tD, tRoute, tT);
        dao.insertTest(test);
        Toast.makeText(this, "Test Added to Database", Toast.LENGTH_SHORT).show();
    }
}