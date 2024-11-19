package usdeps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import usdepartments.Country;
import usdepartments.Department;

public class orm {

	 private static final String URL = " jdbc:h2:~/test";
	 private static final String USER = "sa";
	 private static final String PASSWORD = "";
	
	
	public static void main(String[] args) {
		String countryName = "United States of America";
		String sql = """
				SELECT DEPARTMENT_NAME
				FROM DEPARTMENTS, LOCATIONS, COUNTRIES
				WHERE DEPARTMENTS.LOCATION_ID = LOCATIONS.LOCATION_ID
				  AND LOCATIONS.COUNTRY_ID = COUNTRIES.COUNTRY_ID
				  AND COUNTRIES.COUNTRY_NAME = ?

				""";

        List<Country> countries = new ArrayList<>();
        
try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
		
	    PreparedStatement preparedStatement = connection.prepareStatement(sql);
	){
	
    System.out.println("Connected to the H2 database successfully!");                

	preparedStatement.setString(1, countryName);
	
    try (ResultSet resultSet = preparedStatement.executeQuery()) {
        
        while (resultSet.next()) {
        	
            Country country = new Country();
        	
            country.setName(resultSet.getString("COUNTRY_NAME"));
            
            Department department = new Department();
          
            department.setName(resultSet.getString("DEPARTMENT_NAME"));
            
            country.setDepartment(department);
            
                countries.add(country);
            }

        }
        
         countries.forEach( System.out::println );

        }
        }
					
	}

}