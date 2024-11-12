package session4.example3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection;

    public DatabaseConnection(String url, String username, String password) {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connected to database.");

        } catch (SQLException e) {
            System.out.println("error in connect to database: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
