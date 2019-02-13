package core.java.oops;

public class Bank 
{
	public static void main(String args[])
	{
		Customer c=new Customer(111,"Thiru",'M');
		Account a=new Account(12341003, c,2000.00);
		
		System.out.println("**********CUSTOMER DETAILS***********");
		System.out.println("CUSTOMER ID::    "+c.getId());
		System.out.println("CUSTOMER NAME::  "+c.getName());
		System.out.println("CUSTOMER GENDER::"+c.getGender());
		System.out.println(c.toString());
		
		System.out.println("\n");
		System.out.println("**********ACCOUNT DETAILS**********************");
		a.setBal(2000.00);
		System.out.println("ACCOUNT ID="+a.getAccntid());
		System.out.println("CUSTOMER:: "+a.getCustomer());
		System.out.println("BALANCE="+a.getBal());
		System.out.println("CUSTOMER NAME="+a.getName());
		a.deposit();
		a.withdraw();
	}

}
