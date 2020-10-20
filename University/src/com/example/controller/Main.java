package com.example.controller;

import com.example.model.persons.Student;
import com.example.model.persons.Teacher;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readTeacherFile();
        fileReader.readMixFile();

        List<String> strings = fileReader.getStrings();
        List<Teacher> teachers = fileReader.getTeachers();

        for (int i = 0; i < strings.size(); i++) {
            String[] strs = strings.get(i).split(" ");
            for (int j = 0; j < teachers.size(); j++) {
                if (strs[1].equals(teachers.get(j).getName())) {
                    teachers.get(j).addList(new Student(strs[0]));
                }

            }
        }

        System.out.println("Please enter TeacherName :");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        for (int i = 0; i < teachers.size(); i++) {
            if (str.equals(teachers.get(i).getName())) {
                System.out.println(teachers.get(i).getList());
                break;
            }else  {

                try {

                    throw new NoSuchTeacherFoundException();

                } catch (NoSuchTeacherFoundException e) {
                    System.out.println(e.getMessage());

                }
               break;
            }
    }
}











        }






