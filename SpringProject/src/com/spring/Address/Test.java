package com.spring.Address;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Bank.xml");
	Customer cc=(Customer) context.getBean("cust");
		System.out.println(cc.toString());
		
	}

}
