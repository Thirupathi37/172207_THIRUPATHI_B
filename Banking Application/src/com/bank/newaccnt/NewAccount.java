package com.bank.newaccnt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bank.pojo.PojoNewAccount;

public class NewAccount implements Internew
{
	
	String holderName;
	String email;
	String address;
	String panNumber;
	long aadharNumber;
	long mobileNumber;
	public long account_Number=1234567891;
	String password;
	
	public void createApplication()
	{
		ArrayList a=new ArrayList();
		
		PojoNewAccount p=new PojoNewAccount();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
	      p.setHolderName(sc.next());
		/* System.out.println("ENTER YOUR EMAIL");
		 p.setEmail(sc.next());
		 System.out.println("ENTER YOUR ADDRESS");
		 p.setAddress(sc.next());
		 System.out.println("ENTER YOUR PAN NUMBER");
		 p.setPanNumber(sc.next());
		 System.out.println("ENTER YOUR AADHAR NUMBER");
		 p.setAadharNumber(sc.nextLong());
		 System.out.println("ENTER YOUR MOBILE NUMBER");
		 p.setMobileNumber(sc.nextLong());
		 System.out.println("Create your password");
		p.setPassword(sc.next());*/
		
		a.add(p);
		}
	}

	

