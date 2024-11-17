package jdbc;

import java.sql.*;

public class AllDepInUs {
    public static void main(String[] args) {
        String url = "jdbc:h2:file:/home/milad/test;AUTO_SERVER=TRUE"; 
        String user = "sa";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
        	
            initializeData(connection);

            String sql = "SELECT d.department_id, d.department_name, d.location_id "
                       + "FROM departments d "
                       + "JOIN locations l ON d.location_id = l.location_id "
                       + "JOIN countries c ON l.country_id = c.country_id "
                       + "WHERE c.country_id = ?";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, "US"); 
                
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int departmentId = rs.getInt("department_id");
                    String departmentName = rs.getString("department_name");
                    int locationId = rs.getInt("location_id");
                    
                    System.out.println("Department ID: " + departmentId + ", Name: " + departmentName
                            + ", Location ID: " + locationId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void initializeData(Connection connection) {
        String[] queries = {
        		
            "INSERT INTO countries (country_id, country_name) VALUES ('US', 'United States')",
            "INSERT INTO countries (country_id, country_name) VALUES ('CA', 'Canada')",
            
            "INSERT INTO locations (location_id, city, country_id) VALUES (1, 'New York', 'US')",
            "INSERT INTO locations (location_id, city, country_id) VALUES (2, 'Los Angeles', 'US')",
            "INSERT INTO locations (location_id, city, country_id) VALUES (3, 'Toronto', 'CA')",
            
            "INSERT INTO departments (department_id, department_name, location_id) VALUES (10, 'HR', 1)",
            "INSERT INTO departments (department_id, department_name, location_id) VALUES (20, 'IT', 2)",
            "INSERT INTO departments (department_id, department_name, location_id) VALUES (30, 'Finance', 3)"
        };

        try (Statement statement = connection.createStatement()) {
            for (String query : queries) {
                try {
                    statement.executeUpdate(query);
                } catch (SQLException e) {
                	
                    System.err.println("Error executing query: " + query + "\n" + e.getMessage());
                }
            }
            System.out.println("Initial data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
