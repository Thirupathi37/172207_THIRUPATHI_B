package com.java.Movie;

import java.util.Iterator;
import java.util.TreeSet;

import com.coll.Ass.SavingAccount;

public class Movies {

	public static void main(String[] args) 
	{
		//TreeSet<Movie_Details> ts=new TreeSet<Movie_Details>();
		Movie_Details md1=new Movie_Details("Bahubali","Brabhas","Anuska");
		Movie_Details md2=new Movie_Details("Darling","Brabhas","Kajal");
		Movie_Details md3=new Movie_Details("Balupu","RaviTeja","Anjali");
		
		Movie_DetailsList mdl=new Movie_DetailsList();
		mdl.add_movie(md1);
		mdl.add_movie(md2);
		mdl.add_movie(md3);
		for(Movie_Details mm:mdl.search("MovieName"))
		{
			
		}
		
	}

}
