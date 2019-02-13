package core.java.oops;

import java.util.Scanner;

public class PersonMain 
{

	public static void main(String[] args) 
	{
		Teacher t=new Teacher("RAM","ARMUR");	
		Student s=new Student("RISHI","NIZAMABAD", 4);
		Person p=new Person("Prasadh","Karimnagar");
		System.out.println("PERSON CLASS DETAILS");
		System.out.println("NAME::"+p.getName());
		System.out.println("ADDRESS::"+p.getAddress());
		System.out.println(p.toString());
	System.out.println("\n");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Teacher Course");
	String course=sc.next();
	System.out.println(t.addcourse(course));
	System.out.println("\n");
	System.out.println("Enter A course to remove");
	String course1=sc.next();
	System.out.println(t.removecourse(course1));
	System.out.println(t.toString());
s.addcoursegrade();
s.printgrade();
s.avggrade();
	
	}

}
