package com.bank.pojo;

import java.util.Iterator;

public class PojoNewAccount
{

	private String holderName;
	private String email;
	private String address;
	private String panNumber;
	private long aadharNumber;
	private long mobileNumber;
	//private public long account_Number;
	private String password;
	
	
	public String getHolderName() 
	{
		return holderName;
	}
	
	public void setHolderName(String holderName) 
	{
		this.holderName = holderName;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getPanNumber() 
	{
		return panNumber;
	}
	
	public void setPanNumber(String panNumber) 
	{
		this.panNumber = panNumber;
	}
	
	public long getAadharNumber() 
	{
		return aadharNumber;
	}
	
	public void setAadharNumber(long aadharNumber)
	{
		this.aadharNumber = aadharNumber;
	}
	
	public long getMobileNumber()
	{
		return mobileNumber;
	}
	
	public void setMobileNumber(long mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
