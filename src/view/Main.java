package view;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeFactory.EMPLOYEE_TYPE;

public class Main {

	public static void main(String[] args) {
		Employee employee = null;
		
		employee = EmployeeFactory.createEmployee(EMPLOYEE_TYPE.PROGRAMMER);
		
		System.out.printf("Cargo: %s, Salário: %.2f\n", employee.getPosition(), employee.calculateSalary());
		
		employee = EmployeeFactory.createEmployee(EMPLOYEE_TYPE.LEADER);
		
		System.out.printf("Cargo: %s, Salário: %.2f\n", employee.getPosition(), employee.calculateSalary());
		
		employee = EmployeeFactory.createEmployee(EMPLOYEE_TYPE.MANAGER);
		
		System.out.printf("Cargo: %s, Salário: %.2f\n", employee.getPosition(), employee.calculateSalary());
	}
}
