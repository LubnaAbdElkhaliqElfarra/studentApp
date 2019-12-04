package com.lubna97.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Student> studentList = new ArrayList<>();
    RecyclerView students_rv;
    StudentAdapter studentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        students_rv = findViewById(R.id.students_rv);
        students_rv.setLayoutManager(new LinearLayoutManager(this));
        studentsAdapter = new StudentAdapter(this , studentList);
        students_rv.setAdapter(studentsAdapter);
    }

    private void initData() {
        studentList. add(new Student("Ahamad essa","5" , "20155874" , "40/50"));
        studentList. add(new Student("Banan faris","4" , "2014736" , "30/50"));
        studentList. add(new Student("Lina hamad","5" , "20128955" , "50/50"));
        studentList. add(new Student("Mosa Elagha","2" , "2013698" , "44/50"));
        studentList. add(new Student("Waleed mohamed","1" , "2018458" , "36/50"));
        studentList. add(new Student("Hanaa aziz","3" , "2019778" , "48/50"));

    }
}
