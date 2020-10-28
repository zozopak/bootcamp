package org.example.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private final static String URL = "jdbc:mysql://localhost:3306/uni";
    private final static String PASSWORD = "12345";
    private final static String USERNAME = "root";

    private Connection connection;

    private static DatabaseManager databaseManager = null;

    private DatabaseManager() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseManager getManager() {
        if (databaseManager == null) {
            databaseManager = new DatabaseManager();
        }
        return databaseManager;
    }
}
