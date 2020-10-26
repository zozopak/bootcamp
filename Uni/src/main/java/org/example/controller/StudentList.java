package org.example.controller;

import org.example.model.Student;
import org.example.view.AppStart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList  implements Observer<AppStart> {

    List<Student>students=new ArrayList<>() ;

    public StudentList() {
        this.students=new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }



    @Override
    public void updat(AppStart observable) {
     Student student= observable.student;
     students.add(student);
    }
}
