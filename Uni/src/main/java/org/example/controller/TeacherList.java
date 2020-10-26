package org.example.controller;

import org.example.model.Teacher;

import java.util.Arrays;

public class TeacherList {
    private int size=10;
    Teacher[] teachers=new Teacher[size];

    public void add(String name,String family,int teacherNr) {
        Teacher teacher=new Teacher(family);
        boolean isFull=true;
        for (int i=0;i<teachers.length;i++){
            if((teachers[i])==null) {
                teachers[i] = teacher;
                isFull=false;
                break;
            }
        }
        if(isFull){
            teachers = Arrays.copyOf(teachers, teachers.length + 1);
            teachers[(teachers.length)-1]=teacher;
        }


    }
    public void printAll(){
        System.out.println(Arrays.toString(teachers));
    }
}
