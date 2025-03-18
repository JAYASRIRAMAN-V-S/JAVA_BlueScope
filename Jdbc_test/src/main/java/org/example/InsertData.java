package Jdbc_test.src.main.java.org.example;

import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String link = "jdbc:mysql://localhost:3306/jdbc_demo";
        String name = "root";
        String password = "12345678";

        try(Connection connection = DriverManager.getConnection(link, name, password);
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)")){

            pstmt.setString(1, "Sriram");
            pstmt.setString(2, "sriram@example.com");
            pstmt.executeUpdate();

            System.out.println("Values Added to the Database");


        }catch (SQLException e){
            System.out.println(e);
        }


    }
}
