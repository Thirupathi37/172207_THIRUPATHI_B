package com.example.domain;

public class Employee
{
	protected int employeeId;
	private String employeename;
	private String employeeSSN;
    private float employeesalary;
    
   



	public Employee(int employeeId, String employeename, String employeeSSN, double budget) 
	{
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.employeeSSN = employeeSSN;
		this.employeesalary = employeesalary;	
	
	}



	public String getEmployeename() {
		return employeename;
	}



	public void setEmployeename(String employeename)
	{
		this.employeename = employeename;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public String getEmployeeSSN() {
		return employeeSSN;
	}



	public float getEmployeesalary() {
		return employeesalary;
	}

	public void raiseSalary(double increase)
	{
		
	}
}
