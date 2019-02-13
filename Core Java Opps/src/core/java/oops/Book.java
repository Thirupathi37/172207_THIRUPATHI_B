package core.java.oops;

public class Book 
{
	//private static final String String = null;
	private static String name;
	private static Author author;
	private static double price;
	private static int qnty;
	
	public Book(String name, Author author, double price, int qnty)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qnty=qnty;
	}


public void setPrice(double price)
{
	this.price=price;
}

public void setQnty(int qnty)
{
	this.qnty=qnty;
}



public String getName() 
{
	return name;
}

public Author getAuthor() 
{
	return author;
}

public double getPrice() 
{
	return price;
}

public int getQnty()
{
	return qnty;
}
  
public String toString()
{
	return "BookName="+name+" "+"Author="+author+" "+"Price="+price+" "+"QNTY="+qnty;
}



}
