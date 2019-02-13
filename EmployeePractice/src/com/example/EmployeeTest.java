package com.example;

import java.beans.Encoder;

import com.example.domain.Admin;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest 
{
	static void printEmployee(Employee e1)
	{
		System.out.println("EMP ID iS::"+e1.getEmployeeId());
		System.out.println("EMP NAME::"+e1.getEmployeename());
		System.out.println("EMP SSN::"+e1.getEmployeeSSN());
		System.out.println("EMP SALARY::"+e1.getEmployeesalary());
		
	}

	public static void main(String[] args)
	{
		Employee e1=new Employee(101,"Jone Smith","102-33",5550.09f);
		
		
	EmployeeTest. printEmployee(e1);
		
		Engineer eg=new Engineer(101,"jone Smith","10444-74",484884.099f);
		Manager m1=new Manager(207,"Tom","485-474",46343.00f,"US marketing");
		Admin a1=new Admin(304,"vivek","3373-33-33",33000.00);
		
		
		
	}

}
