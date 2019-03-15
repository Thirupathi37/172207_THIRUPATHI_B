package com.spring.Bank;

public class BankAccount
{

	private int accountId;
	private String accountHolderName;
	private String accountType;
	public double accountBalance;
	
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + ", getAccountId()=" + getAccountId()
				+ ", getAccountHolderName()=" + getAccountHolderName() + ", getAccountType()=" + getAccountType()
				+ ", getAccountBalance()=" + getAccountBalance() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
