package com.spring.S789;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class InitBean implements InitializingBean,DisposableBean,ApplicationContextAware,BeanNameAware
{
	String name;
	private ApplicationContextAware context=null;
	
	public InitBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InitBean(String name) {
		super();
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "InitBean [name=" + name + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception 
	{
	System.out.println("BEFORE BEAN INIT");	
		
	}
	@Override
	public void destroy() throws Exception 
	{
		System.out.println("AFTER BEAN INIT");	
		
	}
	
	public void myInit()
	{
		System.out.println("MY INIT");
	}

	
	public void clean()
	{
		System.out.println("MY CLEAN");
	}
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
	this.context=(ApplicationContextAware) context;
		
	}
	@Override
	public void setBeanName(String context) {
		System.out.println(context);
	}

}
