package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		Triangle tr=(Triangle) context.getBean("triangle");
tr.draw();
	}

}
