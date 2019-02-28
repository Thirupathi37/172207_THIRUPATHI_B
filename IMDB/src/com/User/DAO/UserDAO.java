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
		 Connection con=ConnectionFactory.getConnection();
		  Statement s=con.createStatement();
		  String sql="Select email,password from userRegistration ";
		  ResultSet rs=s.executeQuery(sql);
		  while(rs.next())
		  {
			  String dname=rs.getString("email");
			  String dpwd=rs.getString("password");
			  if(user.getMail().equals(dname)&&user.getPassword().equals(dpwd))
			  {
				  return true;
			  }
			  else
			  {
				  
			  }
		  }
		return false;
      
	}
	
	
	
	
	/*public boolean insert(User user) throws SQLException {
		String query="insert into userRegistration values(?,?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, user.getMail());
		pStatement.setString(2, user.getPassword());
		
		return true;
	}*/
	
	/*public static void main(String args[]) throws SQLException
	{
		boolean b=new UserDAO().insert(new User("mirza11@gmail.com","ok"));
		System.out.println(b);
	}*/
}
