package com.java.streams.Transactions;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TransactionsMain8 
{

	public static void main(String[] args) 
	{
		List<Transactions>list = new ArrayList<>();
		list.add(new Transactions(new Trader("Thirupathi","Telangana"),2011,3500));
		list.add(new Transactions(new Trader("Sai Krishna","Mumbai"),2012,3000));
		list.add(new Transactions(new Trader("Prasanth","Delhi"),2016,2000));
		list.add(new Transactions(new Trader("Rishi","Pune"),2011,4500));
		list.add(new Transactions(new Trader("Seshu","Kolkata"),2011,1500));
		
		List<Trader> list2 =list.stream()
				.filter(t->t.getYear()==2011)
				.sorted(Comparator.comparing(Transactions::getValue))
				.map(Transactions::getTrader)
				.collect(Collectors.toList());
	
		list2.forEach(all->System.out.println("Trader:"+all.getName()));
		System.out.println("----------------------------------------------");
			
		
		
		
	}
}


