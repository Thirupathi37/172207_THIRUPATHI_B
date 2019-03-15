package com.aop.bank;

import java.sql.SQLException;

interface  BankingRepository 
{

	public double getBalance(long accountId) throws SQLException;
	public double updateBalance(long accountId,double newBalance) throws SQLException;
	
}
