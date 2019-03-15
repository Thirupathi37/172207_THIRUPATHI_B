package com.java.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class StudentTest
{  
public static void main(String[] args)
{  
	 
	 BeanFactory factory=new XmlBeanFactory(new FileSystemResource("resource/Spring.xml"));  
	 
	 Student student=(Student) factory.getBean("hello");  
	    student.studentInfo();  
}  
}  