package myapp;

import mydomainmodel.Category;
import mydomainmodel.Employee;
import myrepositories.EmployeesRepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUpdates {

	public static void main(String[] args) {

		try {
			ApplicationContext  ctx = new ClassPathXmlApplicationContext("config.xml");
			EmployeesRepository rep = (EmployeesRepository) ctx.getBean("employeesRepository");
			
			Category c = new Category(-1, "Vitamins", "Vitamin tablets etc");
			if (rep.insertEmployee(c)) {
				System.out.println("Category inserted OK.");
			} else {
				System.out.println("Catgeory not inserted.");
			}

			c = new Category(1, "Drinks", "All types of beverages");
			if (rep.updateEmployee(c)) {
				System.out.println("Catgeory updated OK.");
			} else {
				System.out.println("Catgeory not updated.");
			}

			if (rep.deleteEmployee(8)) {
				System.out.println("Employee deleted OK.");
			} else {
				System.out.println("Employee not deleted.");
			}
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

