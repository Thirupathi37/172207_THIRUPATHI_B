package com.cg.Arr.Emp;

public class MainArray {

	public static void main(String[] args)
	{
		MyArrayList ma=new MyArrayList();
		Employee e1=new Employee(11,"sdf",3454);
		
		ma.addNewEmp(e1);
		ma.display();
	}

}
