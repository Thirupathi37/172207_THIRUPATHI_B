package com.java.Bike;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Factory 
{


public ArrayList order(int item)
{
	ArrayList arr=new ArrayList();
	for(int i=0;i<item;i++)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your bikename");
		String bname=sc.next();
	
		
		arr.add(bname);
	}
	return arr;
	
	
}
	
	
	
}
