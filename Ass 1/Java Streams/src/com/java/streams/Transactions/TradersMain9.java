package com.java.streams.Transactions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TradersMain9 {

	public static void main(String[] args) {
		List<Trader> list=new ArrayList<>();
		list.add(new Trader("Thiru", "Pune"));
		list.add(new Trader("Sai Kumar","Hyderabad"));
		list.add(new Trader("Prashanth", "Delhi"));
		list.add(new Trader("Mahesh", "Pune"));
		list.add(new Trader("Rishi", "maharastra"));
		list.add(new Trader("Ram", "Hyderabad"));
		list.add(new Trader("Sai Krishna", "Pune"));
		list.add(new Trader("Seshu", "AP"));
		list.add(new Trader("Revanth", "Pune"));
		list.add(new Trader("Mirza", "Hyderabad"));
		
	
		System.out.println(":::::Unique Cities are::::");
		List<String> uniquecities=list.stream()
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());
		
		uniquecities.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
	}

}
