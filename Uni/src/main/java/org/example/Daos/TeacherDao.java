package org.example.Daos;

import org.example.controller.DatabaseManager;
import org.example.controller.Repository;
import org.example.model.Teacher;

import java.sql.Connection;
import java.util.List;

public class TeacherDao implements Repository<Teacher,Long> {

    private Connection connection ;

    TeacherDao(Connection connection){
        this.connection=connection;
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
    public Teacher save(Long aLong) {
        return null;
    }

    @Override
    public void update(Teacher teacher) {

    }
}
