package com.java.streams.Transactions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TradersMain13 {

	
	public static void main(String[] args)
	{
		List<Transactions>list = new ArrayList<>();
		list.add(new Transactions(new Trader("Thirupathi","Telangana"),2011,3500));
		list.add(new Transactions(new Trader("Sai Krishna","Mumbai"),2012,3000));
		list.add(new Transactions(new Trader("Prasanth","Delhi"),2016,2000));
		list.add(new Transactions(new Trader("Rishi","Pune"),2011,4500));
		list.add(new Transactions(new Trader("Seshu","Kolkata"),2011,1500));
		
		
		List<Transactions> l1=list.stream().
				filter(d->d.getTrader().getCity()=="Delhi")
				.collect(Collectors.toList());
	l1.forEach(v->System.out.println("Tranctiona Value:"+v.getValue()+"   Trader Name:"+v.getTrader().getName()));

	}

}
