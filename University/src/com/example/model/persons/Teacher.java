package com.example.model.persons;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Student> list;
    public Teacher(String name) {
        super(name);
        this.list=new ArrayList<>();

    }

    public List<Student> getList() {
        return list;
    }

    public void addList(Student student) {
           if(list.isEmpty() ){
               list.add(student);
           }else{
               for (int i = 0; i <list.size() ; i++) {
                   if(!list.get(i).getName().equals(student.getName())){
                       list.add(student);
                   }
               }

           }



        }
    }


