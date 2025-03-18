package Jdbc_test.src.main.java.org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "12345678";

        try(Connection connection = DriverManager.getConnection(url, user, password)){
            if(connection != null){
                System.out.println("Connected to the database...!");
            }
        }catch (SQLException e){
            System.out.println("Connection Failed...!");
            e.printStackTrace();
        }
    }
}