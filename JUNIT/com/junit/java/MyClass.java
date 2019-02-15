package com.junit.java;

import org.junit.Before;

public class MyClass
{
	
	@Before
    public boolean testCheckAge(int age)
    {
    	if(age>=18)
    	{
    		return true;
    	}
    	else
    		return false;
    }
	
	
}
