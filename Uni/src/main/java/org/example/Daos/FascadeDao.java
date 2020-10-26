package org.example.Daos;

import java.sql.Connection;

public class FascadeDao {
    private final CourseDao courseDao;
    private final TeacherDao teacherDao;
    private final StudentDao studentDao;
    public FascadeDao(Connection connection){
        courseDao=new CourseDao(connection);
        teacherDao=new TeacherDao(connection);
        studentDao=new StudentDao(connection);
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
