package com.coll.Ass;

import java.util.Iterator;
import java.util.TreeSet;

public class BankAccountList
{
	 TreeSet<SavingAccount> ts;
 
	public BankAccountList()
	{
		ts=new TreeSet<SavingAccount>();
	}
	
	
	
	public void addAccount(SavingAccount accnt)
	{
		ts.add(accnt);
	}
	
	public TreeSet<SavingAccount> getAllAccounts()
	{
		return ts;
	}
	
}
