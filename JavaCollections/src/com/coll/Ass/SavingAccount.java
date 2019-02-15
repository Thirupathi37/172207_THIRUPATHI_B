package com.coll.Ass;

import java.util.Comparator;

public class SavingAccount implements Comparable<SavingAccount>
{
	int acc_balance;
	double acc_ID;
	String accountHoldername;
	boolean isSalaryAccount;
	
	
	public SavingAccount(int acc_balance, double acc_ID, String accountHoldername) 
	{
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
	}
	
	public int getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	public double getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(double acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	
	public String toString()
	{
		return ("Balance:"+acc_balance+" "+"Account Id:"+acc_ID+" "+"AccountHolderName:"+accountHoldername);
		
	}


	@Override
	public int compareTo(SavingAccount ss) {
		// TODO Auto-generated method stub
		return (int) (this.getAcc_ID()-ss.getAcc_ID());
	}
	

}
