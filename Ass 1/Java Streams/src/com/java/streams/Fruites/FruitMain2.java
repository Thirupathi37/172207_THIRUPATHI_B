package com.java.streams.Fruites;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FruitMain2 
{
 public static void main(String args[])
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
		
		List<Fruit> l2=list.stream().sorted(Comparator.comparing(Fruit::getColour)).collect(Collectors.toList());
		l2.forEach(f->System.out.println("Fruite Name:"+f.getName()+"----Fruit color:"+f.getColour()));
	 
 }

}