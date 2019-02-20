package com.java.streams.Transactions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TradersMain11 {
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

		System.out.println("**************Traders names are************");
		List<Trader> names4=list.stream()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		
	/*	String S=names4.stream()
				.map(Trader::getName)
				.collect(Collectors.joining(","));*/
		names4.forEach(n->System.out.println(n.getName()));	
	}
}
