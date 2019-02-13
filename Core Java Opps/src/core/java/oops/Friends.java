package core.java.oops;

import java.util.ArrayList;

public class Friends 
{
	String name;
	long phn;
	
	public Friends(String name) 
	{
		super();
		this.name = name;
	}

	ArrayList frndnames=new ArrayList();
	ArrayList frndnmbrs=new ArrayList();
	
	public boolean adddetails(String name,String phn)
	{
		frndnames.add(name);
	    frndnmbrs.add(phn);
	    return true;
	}

	public String fndsearch(String find) 
	{
		for(int i=0;i<frndnames.size();i++)
		{
			if(find.equals(frndnames.get(i)))
			{
				System.out.println(frndnmbrs.get(i));
			}
		}
		System.out.println("sorry not found your friend");
		return null;
	}

}
