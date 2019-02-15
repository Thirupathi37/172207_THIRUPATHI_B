package com.java.Movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Movie_DetailsList  implements Comparator<Movie_Details>
{
	 ArrayList<Movie_Details> ts;
	public Movie_DetailsList()
	{
       ts=new ArrayList<Movie_Details>();
	}
	
	
	
	public void add_movie(Movie_Details addmovie)
	{
		ts.add(addmovie);	
	
	}
	
	
	public String remove_movie(String remove)
	{
		for(int i=0;i<ts.size();i++)
		{
			if(remove.equals(ts))
			{
			
			}
		}
		System.out.println(ts);
		return null;
	
	}
	
	public void remove_AllMovies()
	{
		
	}

	public void movie_By_mov_Name()
	{
		
	}

	public ArrayList<Movie_Details> getAllMovies()
	{
		return ts;
	}

	public ArrayList<Movie_Details> search(String name)
	{
	if(name=="MovieName")
	{
		@Override
		public int compare(Movie_Details o1, Movie_Details o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		

	}
	}



	
	


}