package com.java.lambdasAss1;

public class MyArithmetic
{

	public static void main(String[] args) 
	{
		ArithLambda ar=(m,n)->
		{
			System.out.println(m+n);
			System.out.println(m-n);
			System.out.println(m%n);
			System.out.println(m*n);
		};
		ar.arith(10,5);
	}

}
