package com.java.Bike;

import java.util.Collection;

public class Showroom
{
	
	public void disBikes(Collection cl)
	{
		System.out.println("Bike Nanes Are:");
		System.out.println(cl);
	}
	
	
public static void main(String args[])
{
	Bike b=new Bike();
	
	Showroom sh=new Showroom();
	Factory f=new Factory();
	Collection cl=f.order(5);
	
sh.disBikes(cl);
}
	
	
	
}
