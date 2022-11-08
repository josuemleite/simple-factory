package model;

public class Programmer extends Employee {

	public Programmer() {
		super("Programador");
	}

	@Override
	public double calculateSalary() {
		return 8000;
	}
}
