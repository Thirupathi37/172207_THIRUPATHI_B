package com.imdb.SignUpPOJO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.connection.ConnectionFactory;
import com.servlet.CommentStore.CommentPOJO;

public class SignUpDAO 
{
	
	
	public boolean insertRegister(SignUpPOJO signpojo) throws SQLException
	{
		System.out.println(signpojo);
		String query="insert into userRegistration values(?,?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, signpojo.getEmail());
		pStatement.setString(2, signpojo.getPassword());
	     pStatement.executeUpdate();
		return true;
		
	    
	}	
	
	/*public static void main(String args[]) throws SQLException
	{
	new SignUpDAO().insertRegister(new SignUpPOJO("risheeeeee@gmail.com","rishi"));
		
	}*/

}
