package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ApplicantActivity extends AppCompatActivity {

    EditText applicantID;
    EditText firstName;
    EditText lastName;
    EditText testCenter;
    EditText examinerID;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicant);

        applicantID = findViewById(R.id.applicantID);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        testCenter = findViewById(R.id.testCenter);
        examinerID = findViewById(R.id.examinerID);
        recyclerView = findViewById(R.id.recyclerView);
    }

    public void enterClicked(View v){

    }

    public void viewClicked(View v){

    }
}