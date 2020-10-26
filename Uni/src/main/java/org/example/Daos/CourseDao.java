package org.example.Daos;

import org.example.controller.Repository;
import org.example.model.Course;

import java.sql.Connection;
import java.util.List;

public class CourseDao implements Repository<Course,Integer> {
    private Connection connection ;

  CourseDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course findOne(Integer integer) {
        return null;
    }

    @Override
    public void save(Course course) {

    }


    @Override
    public void update(Course course) {

    }
}
