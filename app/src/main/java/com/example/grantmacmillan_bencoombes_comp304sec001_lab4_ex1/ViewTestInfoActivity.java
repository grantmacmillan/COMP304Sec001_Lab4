package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ViewTestInfoActivity extends AppCompatActivity {

    EditText applicantID;
    ListView listView;
    AppDao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_test_info);
        dao = AppDatabase.getInstance(this).appDao();
        applicantID = findViewById(R.id.applicantID);
        listView = findViewById(R.id.listView);
    }

    public void ViewClicked(View v){
        List<Test> testList = dao.getTests();
        List<String> testView = new ArrayList<>();

        for (int i = 0; i < testList.size(); i++) {
            Test test = testList.get(i);
            if(test.applicantId == Integer.parseInt(applicantID.getText().toString())) {
                testView.add("\nTest ID: " + test.getTestId() + "\nApplicant ID: " + test.getApplicantId() + "\nExaminer ID: " + test.getExaminerId() + "\nTest Result: " + test.getTestResult() + "\nTest Date: " + test.getTestDate() + "\nTest Route: " + test.getTestRoute() + "\nTest Type: " + test.getTestType());
            }
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, testView);
        listView.setAdapter(arrayAdapter);
        Toast.makeText(this, "Viewing Tests for Applicant " + Integer.parseInt(applicantID.getText().toString()), Toast.LENGTH_SHORT).show();
    }
}