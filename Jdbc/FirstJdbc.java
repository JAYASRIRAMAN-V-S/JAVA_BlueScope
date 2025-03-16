package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstJdbc {
    public static void main(String[] args) {
        // JDBC URL for MySQL
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";  // Change for PostgreSQL
        String user = "root"; // Change to "postgres" for PostgreSQL
        String password = "12345678";  // Change to your database password

        try {
            // Load the JDBC driver (Optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver"); // Use "org.postgresql.Driver" for PostgreSQL

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connected to the database successfully!");
                conn.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
