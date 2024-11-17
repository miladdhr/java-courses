package jdbc;
import java.sql.*;

public class NewEmployee {

		    public static void main(String[] args) {
		        String url = "  jdbc:h2:/home/milad/test;AUTO_SERVER=TRUE"; 
		        String user = "sa";
		        String password = "";

		        String sql = "INSERT INTO employees (first_name, last_name, email, hire_date, job_id, salary, department_id) "
		                   + "VALUES (?, ?, ?, CURRENT_DATE, ?, ?, ?)";

		        try (Connection connection = DriverManager.getConnection(url, user, password);
		             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

		        	preparedStatement.setString(1, "Milad");
		        	preparedStatement.setString(2, "Dahri");
		        	preparedStatement.setString(3, "Dahri@gmail.com");
		        	preparedStatement.setInt(4, 2); 
		        	preparedStatement.setDouble(5, 50000.00);
		        	preparedStatement.setInt(6, 1); 

		            int affectedRows = preparedStatement.executeUpdate();
		            if (affectedRows > 0) {
		                System.out.println("Employee added successfully!");
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		}
	


