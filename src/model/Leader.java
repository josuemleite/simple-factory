package model;

public class Leader extends Employee {

	public Leader() {
		super("L�der T�cnico");
	}

	@Override
	public double calculateSalary() {
		return 9000;
	}
}
