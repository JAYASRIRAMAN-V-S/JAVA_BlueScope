package org.example;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class DisplayData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String name = "root";
        String pass = "12345678";

        try(Connection connection = DriverManager.getConnection(url, name, pass);
            Statement stmt = connection.createStatement();
            ResultSet rS = stmt.executeQuery("SELECT * FROM users")){
                while(rS.next()){
                    int id = rS.getInt("id");
                    String valName = rS.getString("name");
                    String email = rS.getString("email");

                    System.out.println("🔹 ID: " + id + ", Name: " + valName + ", Email: " + email);
                }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
