package com.spring.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args)
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	
	Shape ss=(Shape) context.getBean("shape");
	System.out.println(ss.getCircle());
	//System.out.println(ss.getTriangle().getName());

	}

}
