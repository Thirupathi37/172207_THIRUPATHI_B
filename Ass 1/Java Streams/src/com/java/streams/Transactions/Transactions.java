package com.java.streams.Transactions;
public class Transactions
{
	private Trader trader;
	private int Year;
	private int Value;
	
	public Transactions(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.Year = year;
		this.Value = value;
	}
	
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return Year;
	}
	public int getValue() {
		return Value;
	}
	


}
