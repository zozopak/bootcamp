package org.example.model;

import org.example.controller.Observable;
import org.example.controller.Observer;

import java.util.ArrayList;
import java.util.List;

public class Student  {
    private String name;
    private String family;
    private int student_number;
    private  Course course;
    private  Teacher teacher;
    private List<Observer>observers=new ArrayList<>();
    public Student(String name, String family, int student_number) {
        this.name = name;
        this.family = family;
        this.student_number = student_number;
        this.course = course;
        this.teacher = teacher;
    }
    public Student(){

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getStNumber() {
        return student_number;
    }

    public void setStNumber(int stNumber) {
        this.student_number = stNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", student_number=" + student_number +
                '}';
    }



}
