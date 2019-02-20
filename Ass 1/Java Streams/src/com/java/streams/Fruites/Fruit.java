package com.java.streams.Fruites;

public class Fruit 
{
	private String Name;
	private int Calories;
	private int Price;
	private String Colour;
	
	public Fruit(String name, int calories, int price, String colour)
	{
		super();
		Name = name;
		Calories = calories;
		Price = price;
		Colour = colour;
	}
	
	public String getName() 
	{
		return Name;
	}
	
	public int getCalories() 
	{
		return Calories;
	}
	
	public int getPrice()
    {
		return Price;
	}
	
	public String getColour() 
	{
		return Colour;
	}
	
	

}
