package com.bank.balenq;

import java.util.Scanner;

public class BalanceEnquery 
{
	double balance=20000;
	String password="1234tr";

	public void displayBalance()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your password");
		String pss=sc.next();
		
		if(pss.equalsIgnoreCase(password))
		{
			System.out.println("Your Balance::"+balance);
		}
		
	}
}
