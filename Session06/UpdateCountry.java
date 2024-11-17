package jdbc;
import java.sql.*;

public class UpdateCountry {


		    public static void main(String[] args) {
		        String url = "  jdbc:h2:/home/milad/test;AUTO_SERVER=TRUE"; 
		        String user = "sa";
		        String password = "";

		        String sql = "UPDATE countries SET country_name = ? WHERE country_id = ?";

		        try (Connection connection = DriverManager.getConnection(url, user, password);
		             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

		        	preparedStatement.setString(1, "Argentina");  
		        	preparedStatement.setString(2, "AR");         

		            int affectedRows = preparedStatement.executeUpdate();
		            if (affectedRows > 0) {
		                System.out.println("Country name updated successfully!");
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		
	}


