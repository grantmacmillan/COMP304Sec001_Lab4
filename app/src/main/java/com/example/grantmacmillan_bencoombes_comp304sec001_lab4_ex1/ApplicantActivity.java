package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ApplicantActivity extends AppCompatActivity {
    AppDao doa;
    EditText applicantID;
    EditText firstName;
    EditText lastName;
    EditText testCenter;
    EditText examinerID;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicant);
        doa = AppDatabase.getInstance(this).appDao();
        applicantID = findViewById(R.id.applicantID);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        testCenter = findViewById(R.id.testCenter);
        examinerID = findViewById(R.id.examinerID);
        listView = findViewById(R.id.listView);
    }

    public void enterClicked(View v) {
        int aId = Integer.parseInt(applicantID.getText().toString());
        String fN = firstName.getText().toString();
        String lN = lastName.getText().toString();
        String tC = testCenter.getText().toString();
        int eId = Integer.parseInt(examinerID.getText().toString());
        Applicant applicant = new Applicant(aId, fN, lN, tC, eId);
        doa.insertApplicant(applicant);
    }

    public void viewClicked(View v) {
        List<Applicant> applicantList = doa.getApplicants();
        List<String> applicantView = new ArrayList<>();

        for (int i = 0; i < applicantList.size(); i++) {
            Applicant app = applicantList.get(i);
            applicantView.add("Applicant ID: " + app.getApplicantId() + "\nName: " + app.getFirstName() + " " + app.getLastName() + "\nTest Center: " + app.getTestCenter() + "\nExaminer ID: " + app.getExaminerId());
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, applicantView);
        listView.setAdapter(arrayAdapter);
    }


}