package com.spring.S789;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitTest {

	public static void main(String[] args)
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("InitBean.xml");
		 ((AbstractApplicationContext) context).registerShutdownHook();
		
		InitBean init=(InitBean) context.getBean("initbean");
		init.toString();
	}
}
