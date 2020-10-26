package org.example.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
   private static  Connection connection = null;
   private DatabaseManager() {

   }
   public  static Connection getInstance(){
       try {
           if(connection !=null) {
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");

           }
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }
       return connection;
   }
}
