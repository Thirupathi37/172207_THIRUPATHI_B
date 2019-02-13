package com.example.domain;

public class Director extends Manager
{
 private double budget;
 
	public Director(int employeeId, String employeename, String employeeSSN, float employeesalary) 
	{
		super(employeeId, employeename, employeeSSN, employeesalary, employeeSSN);
		this.budget=budget;
	}

	public double getBudget()
	{
		return budget;
	}

	

}
