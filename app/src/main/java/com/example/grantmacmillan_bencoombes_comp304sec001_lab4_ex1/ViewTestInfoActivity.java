package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class ViewTestInfoActivity extends AppCompatActivity {

    EditText applicantID;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_test_info);

        applicantID = findViewById(R.id.applicantID);
        listView = findViewById(R.id.listView);
    }

    public void ViewClicked(View v){

    }
}