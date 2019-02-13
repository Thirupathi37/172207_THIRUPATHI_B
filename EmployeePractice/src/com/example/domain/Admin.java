package com.example.domain;

public class Admin extends Employee
{
	 private double budget;
	public Admin(int employeeId, String employeename, String employeeSSN, double budget) 
	{
		super(employeeId, employeename, employeeSSN, budget);
	}

}
