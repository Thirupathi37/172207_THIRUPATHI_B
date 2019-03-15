package com.employee.services;

import java.util.List;
import com.employee.pojo.Employee;

public interface EmployeeServices 
{
	public boolean addEmp(Employee e);
	public boolean deleteEmp(Employee e);
	public boolean updateEmp(Employee e);
	public List<Employee> getEmp(Employee e);
	public String getMaxSal();
	public boolean getEmpWithoutComm();
	
}