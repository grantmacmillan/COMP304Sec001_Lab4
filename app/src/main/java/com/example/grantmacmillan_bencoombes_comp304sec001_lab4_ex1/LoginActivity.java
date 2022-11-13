package com.example.grantmacmillan_bencoombes_comp304sec001_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    AppDao doa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        doa = AppDatabase.getInstance(this).appDao();
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }

    public void loginClicked(View v){
        List<Examiner> examinerList = doa.getExaminers();
        boolean boolLogin = false;
        for(int i = 0; i < examinerList.size(); i++) {
            int id = examinerList.get(i).examinerId;
            String examinerPassword = examinerList.get(i).password;
            if(Integer.parseInt(username.getText().toString()) == id) {
                if(password.getText().toString().equals(examinerPassword)) {
                    boolLogin = true;
                }
            }
        }
        if(boolLogin) {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        } else {
            Toast.makeText(this, "Incorrect ID/Password", Toast.LENGTH_SHORT).show();
        }
    }
}