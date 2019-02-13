package com.example.domain;

public class Manager extends Employee
{
	private String deptName;

	public Manager(int employeeId, String employeename, String employeeSSN, float employeesalary,String deptName)
{
		super(employeeId, employeename, employeeSSN, employeesalary);
		
	}
  public String getDeptName()
  {
	  return deptName;
  }
}
