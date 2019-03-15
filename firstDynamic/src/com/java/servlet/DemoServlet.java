package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.net.httpserver.HttpContext;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServletPath")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String userName1=request.getParameter("userName");
		String password1=request.getParameter("password");
		HttpSession session=request.getSession();
		HttpSession session1=request.getSession();
		ServletContext context=request.getServletContext();
		if(userName1!=""&& userName1!=null)
		{
			session.setAttribute("SetUserName",userName1);
			session1.setAttribute("Setpassword",password1);
			context.setAttribute("SetUserName", userName1);
		}
		out.println("WITHOUT SESSION:"+userName1);
		out.println("SESSION:"+session.getAttribute("SetUserName"));
		out.println("WITHOUT SESSION:"+password1);
		out.println("SESSION:"+(String)session1.getAttribute("Setpassword"));
		out.println("CONTEXT:"+(String)context.getAttribute("SetUserName"));
		
		String prof=request.getParameter("prof");
		out.println("Your Profession is:"+prof);
		
		//String loc=request.getParameter("location");
		String[] loc=request.getParameterValues("location");
		out.println("You are at:"+loc.length+"places");
		for(int i=0;i<loc.length;i++)
		{
			out.println(loc[i]);
		}
	
		RequestDispatcher DR=request.getRequestDispatcher("Demo");
	//	DR.forward(request, response);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		String userName1=
				request.getParameter("userName");
		String password1=request.getParameter("password");
		if(userName1.equals("thiru")&&password1.equals("1234"))
		{
			writer.println("WELCOME "+userName1);
		}
		else{			writer.println("INvalid credentials");
		}
		
		
		
	RequestDispatcher DR=request.getRequestDispatcher("Demo");
	//response.sendRedirect("Loginpath"); 
		
	}

}
