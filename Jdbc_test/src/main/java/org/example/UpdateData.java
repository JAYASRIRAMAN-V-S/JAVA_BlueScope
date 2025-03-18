package Jdbc_test.src.main.java.org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String name = "root";
        String pass = "12345678";

        try(Connection connection = DriverManager.getConnection(url, name, pass); PreparedStatement pstem = connection.prepareStatement("UPDATE users SET email = ? WHERE name = ?")){
            pstem.setString(1, "newemail@gmail.com");
            pstem.setString(2, "John Doe");

            pstem.executeUpdate();

            System.out.println("Value Updated");
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
