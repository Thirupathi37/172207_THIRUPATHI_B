package com.java.Movie;

import java.util.ArrayList;
import java.util.Comparator;

public class Movie_Details 
{
	


	String mov_Name;
	String lead_actor;
	String lead_actories;
       //genre 
	
	public Movie_Details(String mov_Name, String lead_actor, String lead_actories) 
	{
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actories = lead_actories;
	}

	public String getMov_Name() {
		return mov_Name;
	}

	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_actories() {
		return lead_actories;
	}

	public void setLead_actories(String lead_actories) {
		this.lead_actories = lead_actories;
	}
	
	@Override
	public String toString() {
		return "Movie_Details [mov_Name=" + mov_Name + ", lead_actor=" + lead_actor + ", lead_actories=" + lead_actories
				+ "]";
	}

	
	

	
	
	
}
