package com.java.streams.Fruites;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FruitMain1
{
	public static void main(String[] args)
	 {
	List<Fruit> list = new ArrayList<>();
	
	list.add(new Fruit("Mango",150,80,"Red"));
	list.add(new Fruit("Strawberry",200,200,"Yellow"));
	list.add(new Fruit("Grapes",70,50,"Green"));
	list.add(new Fruit("GreenApple",80,40,"Green"));
	list.add(new Fruit("WaterMelon",120,60,"Red"));
	list.add(new Fruit("Banana",190,20,"Yellow"));
	list.add(new Fruit("kiwi",150,80,"Orange"));
	list.add(new Fruit("Pineapple",70,80,"Yellow"));
	list.add(new Fruit("Orange",150,80,"Green"));
	list.add(new Fruit("MuskMelon",150,80,"Peach"));
	
	List<String> l=list.stream().filter(p->p.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed())
			.map(Fruit::getName).collect(Collectors.toList());
	l.forEach(System.out::println);
	
	

	}

}