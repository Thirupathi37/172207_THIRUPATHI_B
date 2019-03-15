package com.java.spring;

public class Triangle 
{  
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle()
	{
		
	}
	
	/*
	 * public Triangle(Point pointA, Point pointB, Point pointC) { super();
	 * this.pointA = pointA; this.pointB = pointB; this.pointC = pointC; }
	 */



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointA() {
		return pointA;
	}



	


	public Point getPointB() {
		return pointB;
	}



	


	public Point getPointC() {
		return pointC;
	}



	


	public void draw()
	{
		System.out.println(getPointA().getX()+"     "+getPointA().getY());
		System.out.println(getPointB().getX()+"     "+getPointB().getY());
		System.out.println(getPointC().getX()+"     "+getPointC().getY());
	}
	
	
	
}
