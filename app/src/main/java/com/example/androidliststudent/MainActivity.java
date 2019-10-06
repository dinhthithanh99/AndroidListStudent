package com.example.androidliststudent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements StudentAdapter.OnItemClicked {
    RecyclerView recyclerViewStudent;
    StudentAdapter studentAdapter;

    private List<student> Students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Students.add(new student("Minh", 20, "Binh Dinh"));
        Students.add(new student("Linh", 19, "Quảng Nam"));
        Students.add(new student("Lan", 21, "Hue"));
        Students.add(new student("An", 20, "Quảng Bình"));

        recyclerViewStudent = findViewById(R.id.recyclerview);
        recyclerViewStudent.setLayoutManager(new LinearLayoutManager(this));

        studentAdapter = new StudentAdapter(this, Students);
        recyclerViewStudent.setAdapter(studentAdapter);

        studentAdapter.setOnClick((StudentAdapter.OnItemClicked) MainActivity.this);
    }

    public void addNewStudent(View view) {
        Students.add(new student("Mai", 18, "Ha Noi"));
        studentAdapter.notifyDataSetChanged();
    }

    public void DeleteLastStudent(View view) {
        Students.remove(Students.size() - 1);
        studentAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, student_infor.class);
        String age = String.valueOf(Students.get(position).getAge());
        intent.putExtra("Name", Students.get(position).getName());
        intent.putExtra("Age", age);
        intent.putExtra("Hometown", Students.get(position).getHometown());
        startActivity(intent);


    }
}
