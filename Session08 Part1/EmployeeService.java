package ir.freeland.jsonquize.service;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ir.freeland.jsonquize.model.Employee;
import ir.freeland.jsonquize.service.exception.EmployeeServiceException;

public class EmployeeService {
	private static final Logger log = Logger.getLogger(EmployeeService.class.getName());
	

	public static List<Employee> readEmployees(String fileName) throws EmployeeServiceException {
		
		File myfile = new File(fileName);
		ObjectMapper objectmapper = new ObjectMapper();
		List<Employee> employee = new ArrayList<>();
		
		try {
			employee = objectmapper.readValue(myfile, new TypeReference<List<Employee>>() {});
		
		} catch (DatabindException e) {
			log.severe("can not pars json check file" + fileName);
			
			throw new EmployeeServiceException("could not bind", e);
			e.printStackTrace();
			
		} catch (IOException e) {
			
			log.severe("Can not read file: " + fileName);
			throw new EmployeeServiceException("  reading error",e);
			e.printStackTrace();
		}
		return employee;
	}
	

	public static void saveEmployee(List<Employee> employees) throws EmployeeServiceException {
		String sql = """
				INSERT INTO employees(first_name,last_name,email,phone_number,job_id,hire_date) 
				VALUES (?,?,?,?,1,CURRENT_DATE)
			""";
	 	try{
	 		PreparedStatement preparedStatement =  
		            ConnectionManager.getConnection().prepareStatement(sql);
	 		log.info("Connected to the H2 database successfully!");
	 		
            for (Employee employe : employees) {
  	
            	preparedStatement.setString(1, employe.getFirstName());
            	preparedStatement.setString(2, employe.getLastName());
            	preparedStatement.setString(3, employe.getEmail());
            	preparedStatement.setString(4, employe.getPhoneNumber());
            	preparedStatement.executeUpdate();		}
            
	            
	    } catch (SQLException e) {
			log.severe("Database Error ");
			throw new EmployeeServiceException("Database Error",e);		
	   }
	
	}
		
}
