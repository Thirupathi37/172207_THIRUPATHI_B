package core.java.oops;

public class Customer 
{
private int id;
static String name;
private char gender;
public Customer(int id, String name, char gender) {
	
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
}
public int getId() 
{
	return id;
}
public String getName()
{
	return name;
}
public char getGender()
{
	return gender;
}

public String toString()
{
	return "Name="+name+"    "+"ID="+id;
}

	
}
