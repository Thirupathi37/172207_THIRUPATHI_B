package com.imdb.Rating;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.connection.ConnectionFactory;
import com.servlet.CommentStore.CommentPOJO;

public class RatingDAO 
{

	
	
	public void  insertRating(RatingPojo rating) throws SQLException
	{
		System.out.println(rating);
		String query="insert into Rating values(?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, rating.getRating());
	     pStatement.executeUpdate();
		
	}	
	
	
	public static void main(String args[]) throws SQLException
	{
		RatingDAO r=new RatingDAO();
		RatingPojo rp=new RatingPojo("3");
		r.insertRating(rp);
	}
	
}
