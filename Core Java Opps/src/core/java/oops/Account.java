package core.java.oops;

import java.util.Scanner;

public class Account
{
private double accntid;
private Customer customer;
private double bal;
public Account(int id, Customer customer, double bal)
{
	super();
	this.accntid = id;
	this.customer =customer;
	this.bal = bal;
}

public double setBal(double bal)
{
	return this.bal=bal;
}
public double getAccntid()
{
	return accntid;
}

public Customer getCustomer()
{
	return customer;
}

public double getBal() 
{
	return bal;
}

@Override
public String toString()
{
	return "ID="+accntid+"Customer="+customer+"BAL="+String.format("%.2f",bal);
}
	
public String getName()
{
	return Customer.name;
}
 public void deposit()
 {
	 double amount=500.00;
	 bal=bal+amount;
	 System.out.println("Total Bal="+bal);
 }
 
 public void withdraw()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("PLS ENTER AMOUNT TO WITHDRAW");
	 float am=sc.nextInt();
	 if(am<=bal)
	 {
		 bal=bal-am;
		 System.out.println("TAKE YOUR AMOUNT:"+am);
		 System.out.println("Remaining Balance="+bal);
	 }
	 else
	 {
		 System.out.println("Amount withdraw exceeds the current balance");
	 }
 }

}
