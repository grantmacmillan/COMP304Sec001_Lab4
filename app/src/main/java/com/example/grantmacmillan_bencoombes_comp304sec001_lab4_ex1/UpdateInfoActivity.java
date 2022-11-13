package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class UpdateInfoActivity extends AppCompatActivity {

    EditText applicantID;
    EditText firstName;
    EditText lastName;
    EditText testCenter;
    EditText examinerID;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_info);

        applicantID = findViewById(R.id.applicantID);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        testCenter = findViewById(R.id.testCenter);
        examinerID = findViewById(R.id.examinerID);
        listView = findViewById(R.id.listView);
    }

    public void UpdateClicked(View v){

    }
}