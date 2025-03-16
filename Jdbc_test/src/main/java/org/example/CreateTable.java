package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String link = "jdbc:mysql://localhost:3306/jdbc_demo";
        String name = "root";
        String password = "12345678";

        try(Connection connection = DriverManager.getConnection(link, name, password); Statement stmt = connection.createStatement()){

            String createTable = "CREATE TABLE IF NOT EXISTS users(" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(100)," +
                    "email VARCHAR(100) UNIQUE" +
                    ")";

            stmt.executeUpdate(createTable);
            System.out.println("Table `users` created successfully");
        }catch (SQLException e){
            System.out.println("Database Not Connected");
            e.printStackTrace();
        }
    }
}
