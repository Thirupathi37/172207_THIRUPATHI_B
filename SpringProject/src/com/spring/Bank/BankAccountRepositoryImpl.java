package com.spring.Bank;

public class BankAccountRepositoryImpl implements  BankAccountRepository
{

	@Override
	public double  getBalance(long accountId)
   {
	return accountId;
		
	}

	@Override
	public double updateBalance(long accountId, double newBalance)
	{
		return newBalance;
	}

}
