package com.nt.beans;

public class Employee {
	
	private int eno;
	private String ename;
	private float esalary;
	
	public Employee(int eno, String ename, float esalary) {
		System.out.println("Employee::3-param constructor");
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	
	

}
