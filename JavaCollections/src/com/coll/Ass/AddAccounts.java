package com.coll.Ass;

public class AddAccounts {

	public static void main(String[] args) 
	{
		SavingAccount s1=new SavingAccount(2000, 333,"Thirupathi");
		SavingAccount s2=new SavingAccount(4000, 111,"Srikanth");
		SavingAccount s3=new SavingAccount(5000, 222,"Haneef");
		
		BankAccountList b=new BankAccountList();
		b.addAccount(s1);
		b.addAccount(s2);
		b.addAccount(s3);
		
		for(SavingAccount sa:b.getAllAccounts())
		{
			System.out.println(sa);
		}
	}

}
