package org.example.Daos;

import org.example.controller.DatabaseManager;
import org.example.controller.Repository;
import org.example.model.Student;

import java.sql.Connection;
import java.util.List;

public class StudentDao implements Repository<Student,Long> {

    private Connection connection ;

    StudentDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findOne(Long aLong) {
        return null;
    }

    @Override
    public Student save(Long aLong) {
        return null;
    }



    @Override
    public void update(Student student) {

    }
}
