package com.example.controller;


import com.example.model.persons.Student;
import com.example.model.persons.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    private File file;
    private List<Teacher> teachers = new ArrayList<>();
     private List<String>strings=new ArrayList<>();

    public List<String> getStrings() {
        return strings;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void readTeacherFile(){
        try {
            file=new File("C:\\Users\\macbook\\Desktop\\teacher.txt");
            Scanner  scanner = new Scanner(file);
            while (scanner.hasNext()) {


                String str = scanner.nextLine();
                Teacher teacher=new Teacher(str);
                teachers.add(teacher);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();


        }



    }

    public void readMixFile() {

        try {
            file=new File("C:\\Users\\macbook\\Desktop\\stte.txt");
            Scanner  scanner = new Scanner(file);
            while (scanner.hasNext()) {


                String str = scanner.nextLine();
                strings.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();


        }


    }
}


