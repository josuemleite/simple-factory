package model;

public class EmployeeFactory {

	public enum EMPLOYEE_TYPE {
		MANAGER,
		PROGRAMMER,
		LEADER;
	}
	
	public static Employee createEmployee(EMPLOYEE_TYPE employeeType) {
		
		if (employeeType == EMPLOYEE_TYPE.MANAGER)
			return new Manager();
		
		if (employeeType == EMPLOYEE_TYPE.PROGRAMMER)
			return new Programmer();
		
		return new Leader();
	}
}
