package com.familytaskmanager;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class TestMySQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/family_task_manager";
        String username = "root";
        String password = "admin123";

        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to MySQL successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
