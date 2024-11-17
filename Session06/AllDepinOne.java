package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;


	public class AllDepinOne {
	    public static void main(String[] args) {
			String url = "  jdbc:h2:/home/milad/test;AUTO_SERVER=TRUE"; 
			
	        String user = "sa";
	        String password = "";
	        
	        String sql = "SELECT employee_id, first_name, last_name, email, job_id, salary "
	                   + "FROM employees WHERE department_id = ?";

	        try (Connection conn = DriverManager.getConnection(url, user, password);
	             PreparedStatement ResultSet = conn.prepareStatement(sql)) {

	        	ResultSet.setInt(1, 1);
	            ResultSet rs = ResultSet.executeQuery();
	            
	            while (rs.next()) {
	                int employeeId = rs.getInt("employee_id");
	                String firstName = rs.getString("first_name");
	                String lastName = rs.getString("last_name");
	                String email = rs.getString("email");
	                int jobId = rs.getInt("job_id");
	                double salary = rs.getDouble("salary");
	                
	                System.out.println("Employee ID: " + employeeId + ", Name: " + firstName + " " + lastName
	                        + ", Email: " + email + ", Job ID: " + jobId + ", Salary: " + salary);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
