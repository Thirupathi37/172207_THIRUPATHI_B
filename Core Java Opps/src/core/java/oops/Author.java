package core.java.oops;

public class Author 
{
	private String name;
	private String email;
	private char gender;
	
public Author(String name, String email, char gender) 
{
	//super();
	this.name = name;
	this.email = email;
	this.gender = gender;
}


public void setEmail(String email) 
{
	this.email = email;
}


public String getName()
{
	return name;
}

public char getGender()
{
	return gender;
}


public String getEmail()
{
	return email;
}
 public String toString()
 {
	 return "AuthorName:"+name+" "+"AuhtorMail:"+email+" "+"AuthorGender:"+gender;
 }
 
}
