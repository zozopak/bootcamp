package org.example.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.Daos.CourseDao;
import org.example.Daos.FascadeDao;
import org.example.Daos.StudentDao;
import org.example.Daos.TeacherDao;
import org.example.controller.DatabaseManager;
import org.example.model.Course;
import org.example.model.Student;
import org.example.model.Teacher;

import java.sql.Connection;

public class AppStart extends Application {
    private static FascadeDao fascadeDao;



    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 800);
        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.show();


        Label label1 = new Label();
        label1.setText("Name : ");
        Label label2 = new Label();
        label2.setText("Family : ");
        Label label3 = new Label();
        label3.setText("StN : ");
        Label label4 = new Label();
        label4.setText("Course");
        Label label5 = new Label();
        label5.setText("Teacher");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        Button button = new Button();
        button.setMaxSize(100, 100);
        button.setText("Save");
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(100, 100, 0, 50));
        root.getChildren().addAll(vBox);
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        HBox hBox3 = new HBox();
        HBox hBox4 = new HBox();
        HBox hBox5 = new HBox();


        hBox1.getChildren().addAll(label1);
        hBox1.getChildren().addAll(textField1);
        hBox2.getChildren().addAll(label2);
        hBox2.getChildren().addAll(textField2);
        hBox3.getChildren().addAll(label3);
        hBox3.getChildren().addAll(textField3);
        hBox4.getChildren().addAll(label4);
        hBox4.getChildren().addAll(textField4);
        hBox5.getChildren().addAll(label5);
        hBox5.getChildren().addAll(textField5);

        vBox.getChildren().addAll(hBox1);
        vBox.getChildren().addAll(hBox2);
        vBox.getChildren().addAll(hBox3);
        vBox.getChildren().addAll(hBox4);
        vBox.getChildren().addAll(hBox5);
        vBox.getChildren().addAll(button);
        fascadeDao = new FascadeDao();
        StudentDao studentDao = fascadeDao.getStudentDao();
        TeacherDao teacherDao = fascadeDao.getTeacherDao();
        CourseDao courseDao = fascadeDao.getCourseDao();
        Student student = new Student();
        Teacher teacher = new Teacher();
        Course course = new Course();
        button.setOnMouseClicked(e -> {
            student.setName(textField1.getText());
            student.setFamily(textField2.getText());
            student.setStNumber(Integer.parseInt(textField3.getText()));

            course.setName(textField4.getText());
            teacher.setFamily(textField5.getText());
            studentDao.save(student);
            teacherDao.save(teacher);
            courseDao.save(course);
        });


    }


}
