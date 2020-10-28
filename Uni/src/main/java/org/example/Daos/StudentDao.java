package org.example.Daos;

import org.example.controller.DatabaseManager;
import org.example.controller.Observable;
import org.example.controller.Observer;
import org.example.controller.Repository;
import org.example.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements Repository<Student,Integer> {

 private Connection connection ;

    public StudentDao() {
       connection= DatabaseManager.getManager().getConnection();
    }

    @Override
    public List<Student> findAll() {
       List<Student> students = new ArrayList<>();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Student");
            while (resultSet.next()) {
               int id= resultSet.getInt(1);
                String name = resultSet.getNString(2);
                String family = resultSet.getNString(3);
                int student_number=resultSet.getInt(4);
                Student student = new Student();
                student.setStNumber(student_number);
                student.setName(name);
                student.setFamily(family);
               students.add(student);

            }
            System.out.println(students);
            } catch(SQLException throwables){
                throwables.printStackTrace();
            }

        return students;


        }
    @Override
    public Student findOne(Integer id) {
        Student student = new Student();

        try {

            PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id=?");
            preparedStatement.setInt(1, id);
            ResultSet set = preparedStatement.executeQuery();
            while (set.next()) {
                int st_number = set.getInt(1);
                String name = set.getString(2);
                String family = set.getString(3);
                student.setName(name);
                student.setFamily(family);
                student.setStNumber(st_number);
                System.out.println(student);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return student;
    }

    @Override
    public void save(Student student){

       PreparedStatement statement=null;
        try {
            statement = connection.prepareStatement("insert into student (firstname,family,student_number)"+" values (?,?,?)");
           statement.setString(1,student.getName());
           statement.setString(2,student.getFamily());
           statement.setInt(3,student.getStNumber());
           statement.execute();
            System.out.println("done!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }





    }



    @Override
    public void update(Student student) {

    }


}
