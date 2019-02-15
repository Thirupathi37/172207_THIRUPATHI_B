package com.cg.Arr.Emp;

import java.util.Scanner;

public class MyArrayList<Emp> 
{
	int size=0;
private Employee e[];
	
	public MyArrayList() 
	{
		
		e=new Employee[2];
	}



	public void addNewEmp(Employee e)
	{
		
	
	  if(!isNotFull())
	  {
		
			size++;
		}
	  
	  else
	  {
		  System.out.println("ArrayFull");
	  }
	  
	}
	
	public void display()
	{
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].getId()+e[i].getCompany()+e[i].getSalary());
		}
	}
	
	
	public boolean isNotFull()
	{
		if(size==1)
		{
			return true;
		}
		return false;
		
		
	}
	
	
	/*public void removeEmp()
	{
		if(size!=0)
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter emp id to remove");
			int id=sc1.nextInt();
			for(int i=0;i<e.length;i++)
			{
				if(id==e.i)
			}
		}
	}*/
	
}
