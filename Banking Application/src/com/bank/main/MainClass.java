package com.bank.main;
import com.bank.pojo.PojoNewAccount;
import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

import javax.security.auth.login.LoginContext;

import com.bank.balenq.BalanceEnquery;
import com.bank.login.Login;
import com.bank.newaccnt.NewAccount;

public class MainClass 
{
static String ch;
	public static void main(String[] args) 
	{
		BalanceEnquery b=new BalanceEnquery ();
		b.displayBalance();
		/*System.out.println("WELCOME TO BANK");
		NewAccount n=new NewAccount();
		n.createApplication();
		
		PojoNewAccount p=new PojoNewAccount();
		System.out.println(p.getHolderName());
		Iterator i=p.iterator(); 
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}*/
	}
	

}
