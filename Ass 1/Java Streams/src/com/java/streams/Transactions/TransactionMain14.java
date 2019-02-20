package com.java.streams.Transactions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TransactionMain14 
{

	public static void main(String[] args)
	{
		List<Transactions>list = new ArrayList<>();
		list.add(new Transactions(new Trader("Thirupathi","Telangana"),2011,3500));
		list.add(new Transactions(new Trader("Sai Krishna","Mumbai"),2012,3000));
		list.add(new Transactions(new Trader("Prasanth","Delhi"),2016,2000));
		list.add(new Transactions(new Trader("Rishi","Pune"),2011,4500));
		list.add(new Transactions(new Trader("Seshu","Kolkata"),2011,1500));
		
		
		Transactions max=list.stream()
				.max((p1,p2)->Integer.compare(p1.getValue(), p2.getValue()))
				.get();
		System.out.println(max.getValue());
   }
}
