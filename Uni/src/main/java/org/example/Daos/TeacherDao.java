package org.example.Daos;

import org.example.controller.DatabaseManager;
import org.example.controller.Repository;
import org.example.model.Teacher;

import java.sql.Connection;
import java.util.List;

public class TeacherDao implements Repository<Teacher,Long> {
 private Connection connection;

    public TeacherDao() {
        connection=DatabaseManager.getManager().getConnection();
    }

    @Override
    public List<Teacher> findAll() {
        return null;
    }

    @Override
    public Teacher findOne(Long aLong) {
        return null;
    }

    @Override
    public void save(Teacher teacher) {
       
    }

    @Override
    public void update(Teacher teacher) {

    }
}
