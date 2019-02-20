package com.java.lambdasAss1;

import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;

public class RemoveOddLength
{

	public static void main(String[] args) 
	{
		ArrayList arr=new ArrayList();
		arr.add("sai");
		arr.add("Thirupathi");
		arr.add("prasanth");
		arr.add("revanth");
		arr.add("Sneha");
		arr.add("Gopikrishna");
		arr.add("Rishi");
		arr.add("Sheshu");
		arr.add("Madhu * ");
		System.out.println(arr);
		
	arr.removeIf(n ->((String) n).length()%2==1);
	
     arr.forEach(System.out::println);
	}

}
	