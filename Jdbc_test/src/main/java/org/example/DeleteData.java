package Jdbc_test.src.main.java.org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String name = "root";
        String pass = "12345678";

        try(Connection connection = DriverManager.getConnection(url, name, pass); PreparedStatement pstem = connection.prepareStatement("DELETE FROM users WHERE name = ?")){

            pstem.setString(1, "John Doe");

            pstem.executeUpdate();

            System.out.println("Value Deleted");
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
