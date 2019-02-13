package core.java.oops;

import java.util.Scanner;

public class PhoneBook
{
	
	public static void main(String args[]) 
	{
	
	
	Friends t=new Friends("Thiru");
	t.adddetails("Thiru", "8790120632");
	t.adddetails("Sri", "87901224323");
	t.adddetails("haneef", "63627120632");
	t.adddetails("Ram", "879037373632");
	t.adddetails("Rishi", "7727263632");
	t.adddetails("sheshu", "2883538822");	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a name");
	String nm=sc.next();
	//System.out.println("enter number");
	//nm=sc.next();
	
	String find=t.fndsearch(nm);
	
	}
	
}
