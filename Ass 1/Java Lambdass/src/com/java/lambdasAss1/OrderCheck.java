package com.java.lambdasAss1;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class OrderCheck {

	public static void main(String[] args) 
	{
	   OrdersLambda o=(price)->
	   {
		   if(price>10000)
		   {
			   System.out.println("Accepted");
		   }
		   else
		   {
			   System.out.println("Completed");
		   }
		  
	   };
	   
	   Scanner sc= new Scanner(System.in);
	   System.out.println("enter amount");
	   int amnt=sc.nextInt();
	   o.orderprice(amnt);
	}

}
