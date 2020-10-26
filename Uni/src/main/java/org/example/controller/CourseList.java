package org.example.controller;

import org.example.model.Course;

import java.util.Arrays;

public class CourseList {
    private int size=10;
   Course[] subjects=new Course[size];

    public void add(String name) {
        Course subject=new Course(name);
        boolean isFull=true;
        for (int i=0;i<subjects.length;i++){
            if((subjects[i])==null) {
                subjects[i] = subject;
                isFull=false;
                break;
            }
        }
        if(isFull){
            subjects= Arrays.copyOf(subjects, subjects.length + 1);
         subjects[(subjects.length)-1]=subject;
        }


    }
    public void printAll(){
        System.out.println(Arrays.toString(subjects));
    }
}
