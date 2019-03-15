package com.spring.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBC
{

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Jdbc.xml");  
	      
	    EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");  
	    int status=dao.saveEmployee(new Employee(102,"Thiru",350));  
	    System.out.println(status);
	    
	    
	    int status1=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		System.out.println(status1);
		
		
		/*Employee e=new Employee();
		e.setId(102);
		int status2=dao.deleteEmployee(e);
		System.out.println(status2);*/
		

	}

}
