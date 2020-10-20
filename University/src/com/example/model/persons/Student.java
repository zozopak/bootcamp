package com.example.model.persons;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{


    public Student(String name) {
        super(name);


    }

    @Override
    public String toString() {
        return this.getName();
    }


}
