package com.example.androidliststudent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class student_infor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tvName, tvAge, tvHometown;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);

        String name = getIntent().getExtras().getString("Name");
        String age = getIntent().getExtras().getString("Age");
        String hometown = getIntent().getExtras().getString("Hometown");

        tvName = findViewById(R.id.name);
        tvName.append(name);

        tvAge = findViewById(R.id.age);
        tvAge.append(age);

        tvHometown = findViewById(R.id.hometown);
        tvHometown.append(hometown);

    }
}
