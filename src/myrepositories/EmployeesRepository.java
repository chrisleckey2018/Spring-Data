package myrepositories;

import mydomainmodel.Category;
import mydomainmodel.Employee;

import java.util.Map;
import java.util.List;

public interface EmployeesRepository {

	// Simple queries.
	int  getEmployeesCount();
	
	Map<String,Object> getEmployeeAsMap(int empID);

	List<Map<String,Object>> getAllEmployees();

	
	// Call-back queries.
	Employee getEmployeeAsObject(int empID);

	List<Employee> getAllEmployeesAsObjects();
	
	void generateReport();
	
	
	// Update operations.
	boolean insertEmployee(Category c);
	
	boolean updateEmployee(Category c);
	
	boolean deleteEmployee(int id);
}
