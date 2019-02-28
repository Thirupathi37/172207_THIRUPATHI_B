package com.imdb.SignUpPOJO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.User.DAO.UserDAO;
import com.imdb.User.pojo.User;
import com.servlet.CommentStore.CommentPOJO;
import com.servlet.CommentStore.CommentsDAO;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet(description = "SignUpDescription", urlPatterns = { "/SignUpServletPath" })
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/*PrintWriter out=response.getWriter();
		out.println("dfdf");
		String email=request.getParameter("email");
		String password=request.getParameter("Create Password");
		String password1=request.getParameter("Confirm Password");
		if(password.equals(password1))
		{
		
			SignUpDAO signdao=new SignUpDAO();
			SignUpPOJO signpojo=new SignUpPOJO(email,password);
			
			try {
			
				if(	signdao.insertRegister(signpojo)) {
					response.sendRedirect("Azzan.html");
				}
				else
				{
					response.sendRedirect("SignUp.html");
				}
			    } 
			catch (SQLException e) {
				
				
				e.printStackTrace();
			    }*/
//======================================================================================		
		/*	try {
				if(new SignUpDAO().insertRegister(new SignUpPOJO(request.getParameter("email"),request.getParameter("password"))))
				{
					response.sendRedirect("Azaan.html");
				}
			   } 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
	//======================================================================
			SignUpPOJO signpojo=new SignUpPOJO(request.getParameter("email"),request.getParameter("password"));
			SignUpDAO signdao=new SignUpDAO();
	 	
	    	  boolean status =false;
			try {
				status = signdao.insertRegister(signpojo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				PrintWriter out=response.getWriter();
			}
	    	  if(status) {
	    		 
	    		response.sendRedirect("Azaan.html");
	    	  }
	    	  else {
	    		  response.sendRedirect("SignUp.html");
	    	  }
			
         
		
         }

	}



