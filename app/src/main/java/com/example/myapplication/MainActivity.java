package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText fname_edit;
    Button savebt;
    TextView fname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lab_demo);

        fname = findViewById(R.id.fname);
        fname_edit = findViewById(R.id.fname_edit);
        savebt = findViewById(R.id.savebt);

        savebt.setOnClickListener(v -> {

            String name = fname_edit.getText().toString().trim();

            if (name.isEmpty()) {
                fname_edit.setError("Please enter your name");
            } else {
                Toast.makeText(
                    MainActivity.this,
                    "Welcome " + name,
                    Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}