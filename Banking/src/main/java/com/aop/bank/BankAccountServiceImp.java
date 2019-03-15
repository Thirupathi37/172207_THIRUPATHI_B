package com.aop.bank;

import java.sql.SQLException;



public class BankAccountServiceImp implements BankAccountService
{
	private BankAccountServiceImp repository;
	
	public double withdraw(long accountId, double balance) throws SQLException
	{
		double previousBalance=repository.getBalance(accountId);
		if(previousBalance>=balance)
		{
			return repository.updateBalance(accountId, previousBalance-balance);
		}
		return 0;
	}

	public double deposit(long accountId, double balance) throws SQLException 
	{
		double previousBalance=repository.getBalance(accountId);
		return repository.updateBalance(accountId, previousBalance+balance);
	}

	public double getBalance(long accountId) throws SQLException 
	{
	
		return repository.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws SQLException 
	{
		double previousBalance=repository.getBalance(fromAccount);
		if(previousBalance>=amount)
		{
			double previousBalanceInAccount=repository.getBalance(toAccount);
			repository.updateBalance(toAccount, previousBalance+amount);
			repository.updateBalance(fromAccount, previousBalanceInAccount-amount);
			return true;
		}
		return false;
	}

	public void setRepository(BankAccountRepositoryImp repository) {
		this.repository = repository;
	}
	
}
