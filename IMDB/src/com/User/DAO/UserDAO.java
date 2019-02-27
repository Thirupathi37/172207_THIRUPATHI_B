package com.User.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.ws.Response;

import com.imdb.User.pojo.User;
import com.java.connection.ConnectionFactory;

import java.io.PrintWriter;
import java.sql.Connection;

public class UserDAO 
{

	//private static final Statement DbConnection = null;

	public boolean isUser(User user) throws SQLException
	{
		try {

			String query="select * from userRegistration where 	mail=? password=? ";
			Connection con=ConnectionFactory.getConnection();
			System.out.println("estab");
			PreparedStatement pst=con.prepareStatement(query);
				      
					  pst.setString(1, user.getMail());
					  pst.setString(2, user.getPassword());
					
					  pst.executeUpdate();
					  
					  ResultSet results = pst.executeQuery(query);
			            while (results.next()) 
			            {
			            
			               return true;
			            }
		         }
			     catch(Exception e)
			            {
			            	e.printStackTrace();
			            }
		
		
						return false;
	
	}
	
	/*public static void main(String args[]) throws SQLException
	{
		boolean b=new UserDAO().isUser(new User("mirza@gmail.com","ok"));
		System.out.println(b);
	}*/
}
