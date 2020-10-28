package org.example.Daos;

import org.example.controller.Observable;
import org.example.controller.Observer;

import java.sql.Connection;

public class FascadeDao {
    private final CourseDao courseDao;
    private final TeacherDao teacherDao;
    private final StudentDao studentDao;
    public FascadeDao(){
        courseDao=new CourseDao();
        teacherDao=new TeacherDao();
        studentDao=new StudentDao();
    }

    public CourseDao getCourseDao() {
        return courseDao;
    }

    public TeacherDao getTeacherDao() {
        return teacherDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }


}
