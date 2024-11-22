package ir.freeland.jsonquize;

import java.io.FileInputStream;
import java.util.List;
import java.util.logging.LogManager;

import ir.freeland.jsonquize.model.Employee;
import ir.freeland.jsonquize.service.EmployeeService;

public class EmployeeApplication {
	

	private static final String LOGGING_PROPERTIES = "logging properties";

	public static void main(String[] args) throws Exception {
		LogManager.getLogManager().readConfiguration(new FileInputStream(LOGGING_PROPERTIES) );
		
// Call Read Class
 
		List<Employee> employee = EmployeeService.readEmployees("data-employees.json");
		System.out.println(employee);
		
// Call Save Class
	
		EmployeeService.saveEmployee(employee);
	
//	Remove +	
		
		employee.forEach(t -> {
		    String phone = t.getPhoneNumber();
		    if (phone != null) {
		        t.setPhoneNumber(phone.replace("+", ""));
		    }
		});


		employee.forEach(System.out::println);

		
	}
}