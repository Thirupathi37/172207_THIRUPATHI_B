package core.java.oops;

public class AB 
{
 
	public static void main(String[] args) 
	
	{
		 Author a=new Author("Thirupathi","thirupathiraj2018@gmail.com",'M');
			Book b=new Book("Learn Java", a, 250.00, 5);
			b.setPrice(250.00);
			b.setQnty(2);
			System.out.println(a.toString());
			System.out.println(b.toString());
		
	}

	
}
