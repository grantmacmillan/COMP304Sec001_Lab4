package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class UpdateInfoActivity extends AppCompatActivity {
    AppDao dao;
    EditText applicantID;
    EditText firstName;
    EditText lastName;
    EditText testCenter;
    EditText examinerID;
    ListView listView;
    Context context;
    Applicant editedApplicant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_info);
        dao = AppDatabase.getInstance(this).appDao();
        context = this;
        applicantID = findViewById(R.id.applicantID);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        testCenter = findViewById(R.id.testCenter);
        examinerID = findViewById(R.id.examinerID);
        listView = findViewById(R.id.listView);

        UpdateListView();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String)parent.getItemAtPosition(position);
                selectedItem = selectedItem.split("\n")[0];
                selectedItem = selectedItem.replaceAll("[^\\d.]", "");

                int aId = Integer.parseInt(selectedItem);
                List<Applicant> applicantList = dao.getApplicants();
                for (int i = 0; i < applicantList.size(); i++) {
                    Applicant app = applicantList.get(i);
                    if(app.getApplicantId() == aId) {
                        editedApplicant = app;
                        applicantID.setText(String.valueOf(aId));
                        firstName.setText(app.getFirstName());
                        lastName.setText(app.getLastName());
                        testCenter.setText(app.getTestCenter());
                        examinerID.setText(String.valueOf(app.getExaminerId()));
                    }
                }
            }
        });
    }

    public void UpdateClicked(View v){
        editedApplicant.setFirstName(firstName.getText().toString());
        editedApplicant.setLastName(lastName.getText().toString());
        editedApplicant.setTestCenter(testCenter.getText().toString());
        editedApplicant.setExaminerId(Integer.parseInt(examinerID.getText().toString()));

        dao.updateApplicant(editedApplicant);

        Toast.makeText(this, "Applicant Updated", Toast.LENGTH_SHORT).show();
        UpdateListView();
    }

    public void UpdateListView() {
        List<Applicant> applicantList = dao.getApplicants();
        List<String> applicantView = new ArrayList<>();

        for (int i = 0; i < applicantList.size(); i++) {
            Applicant app = applicantList.get(i);
            applicantView.add("Applicant ID: " + app.getApplicantId() + "\nName: " + app.getFirstName() + " " + app.getLastName() + "\nTest Center: " + app.getTestCenter() + "\nExaminer ID: " + app.getExaminerId());
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, applicantView);
        listView.setAdapter(arrayAdapter);
    }
}