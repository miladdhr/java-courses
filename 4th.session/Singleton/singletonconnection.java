package session4.example3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionSingleton {
    private static DatabaseConnectionSingleton instance;
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/yourdatabase";
    private static final String USERNAME = "yourusername";
    private static final String PASSWORD = "yourpassword";

    private DatabaseConnectionSingleton() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("connected to database.");
        } catch (SQLException e) {
            System.out.println("error in connect to database: " + e.getMessage());
        }
    }

    public static DatabaseConnectionSingleton getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionSingleton.class) { 
                if (instance == null) { 
                    instance = new DatabaseConnectionSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
