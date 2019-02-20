package com.java.streams.Transactions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TradersMain12 
{

	public static void main(String[] args) {
		List<Trader> list=new ArrayList<>();
		list.add(new Trader("Thiru", "Pune"));
		list.add(new Trader("Sai Kumar","Hyderabad"));
		list.add(new Trader("Prashanth", "Delhi"));
		list.add(new Trader("Mahesh", "Pune"));
		list.add(new Trader("Rishi", "maharastra"));
		list.add(new Trader("Ram", "Mumbai"));
		list.add(new Trader("Sai Krishna", "Pune"));
		list.add(new Trader("Seshu", "AP"));
		list.add(new Trader("Revanth", "Pune"));
		list.add(new Trader("Mirza", "Indore"));
		
		System.out.println("Traders based in Indore are_>>>>>");
		List<String> names2=list.stream()
				.filter(p->p.getCity()=="Indore")
				.map(Trader::getName)
				.collect(Collectors.toList());
		names2.forEach(System.out::println);
		
	}
}
