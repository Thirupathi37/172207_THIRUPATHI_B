package com.imdb.validation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.User.DAO.UserDAO;
import com.imdb.User.pojo.User;
import com.java.ValidationDAO.ValidationDAO;


@WebServlet(description = "CredentialsValidation", urlPatterns = { "/ValidationPath" })
public class Validation extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
    public Validation()
    {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.getWriter().print("redirect main   ");
		User user=new User(request.getParameter("email"),request.getParameter("password"));
		UserDAO logindao=new UserDAO();
 	//response.getWriter().print("redirect try");
    	  boolean status =false;
		try {
			status = logindao.isUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PrintWriter out=response.getWriter();
		}
    	  if(status) {
    		 
    		response.sendRedirect("Comment.html");
    	  }
    	  else {
    		  response.sendRedirect("SignUp.html");
    	  }
		
		
		/*String username=request.getParameter("email");
		String password=request.getParameter("pwd");
		
		User user=new User(username, password);
		
		UserDAO u=new UserDAO();
		
		 boolean status=false;
		 
	     try 
	     {
			status=u.isUser(user);
		} 
	     catch (SQLException e) 
	     {
			e.printStackTrace();
	    }
	     response.getWriter().print(status);
		//System.out.println(status);
		 PrintWriter out=response.getWriter();
		if(status==true)
		{
			
			response.sendRedirect("Azaan.html");
			
		}
		else
		{
			response.sendRedirect("SignUp.html");
		}*/
		
		
		
		
	}
}
