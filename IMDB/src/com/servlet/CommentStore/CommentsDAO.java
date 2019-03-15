package com.servlet.CommentStore;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.connection.ConnectionFactory;
import java.sql.Connection;

public class CommentsDAO
{	
	
	public void  insertComments(CommentPOJO comm) throws SQLException
	{
		String query="insert into Comments values(?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, comm.getComment());
	    pStatement.executeUpdate();
	}	
	
	

	
/*	public static void main(String args[]) throws SQLException
	{
		CommentsDAO o=new CommentsDAO();
		o.insertComments(new CommentPOJO("thirupathi"));
	}*/
}
