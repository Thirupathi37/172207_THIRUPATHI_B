package com.spring.QueAns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQueAns {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("ListSetMap.xml");
		
		ListAns ans=(ListAns) context.getBean("listbean");
        SetAns ans1=(SetAns) context.getBean("setbean");
        MapAns ans2=(MapAns) context.getBean("mapbean");
        ans.displayList();
        ans1.displaySet();
        ans2.displayMap();
	}

}
