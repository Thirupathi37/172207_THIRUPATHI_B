package com.aop.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankRepositoryImpl implements BankRepository
{

	public double getBalance(long accountId) throws SQLException
	{
		
		String query="select accountbalance from bankAccount where accountid=?";
		double balance=-1;
		Connection conn=DatabaseConnection.getConnection();
		PreparedStatement prepareStatement=conn.prepareStatement(query);
		prepareStatement.setLong(1, accountId);
		ResultSet result=prepareStatement.executeQuery();
		while(result.next()) 
		{
			balance=result.getDouble("accountbalance");
		}
		return balance;
	}

	public double updateBalance(long accountId, double newBalance) throws SQLException 
	{
		String query="update bankaccount set accountbalance=? where accountid=?";
		int updatedRows=-1;
		double balance=-1;
			Connection conn = DatabaseConnection.getConnection();	
			PreparedStatement preparedStatement=conn.prepareStatement(query);
			preparedStatement.setDouble(1,newBalance);
			preparedStatement.setLong(2,accountId);
			updatedRows=preparedStatement.executeUpdate();
		if(updatedRows==1) {
			return newBalance;
			
		}
		else {
			return -1;
		}
	}
	
}
