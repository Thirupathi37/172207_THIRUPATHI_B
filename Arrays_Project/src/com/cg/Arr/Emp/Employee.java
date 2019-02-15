package com.cg.Arr.Emp;

public class Employee {

	int id;
	String company;
	double salary;
	
	public Employee(int id,String company,double salary) 
	{
		super();
		this.id = id;
		this.company = company;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
