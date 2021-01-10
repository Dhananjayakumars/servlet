package com.xworkz.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInPage extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("It is from the Get");

		/* PrintWriter out = resp.getWriter(); */

		String email = req.getParameter("email");
		String password = req.getParameter("pass");

		System.out.println("email recieved is " + email);
		System.out.println("password recieved is " + password);

		/*
		 * StringBuilder str = new StringBuilder(); str.
		 * append("<!DOCTYPE html><html><head><title>Document</title>D Flix</head> <body>"
		 * ); if (email.equals("dhananjay@gmail.com")) { str.append(" <h1>Welcome " +
		 * email + "</h1>");
		 * 
		 * } else { str.append("<h1> Sry wrong credentials try again</h1>");
		 * str.append("<h3> <a href='login.html'>Login again</h3>"); }
		 * str.append("</body>" + "</html>"); out.print(str);
		 */
		if(email.equals("dhananjay@gmail.com")&&(password.equals("7090"))) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("movies.html");
			dispatcher.forward(req, resp);
		}
			else {
				RequestDispatcher dispatcher=req.getRequestDispatcher("signup.html");
				dispatcher.forward(req, resp);
			}
			
		}

	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("It is from the post");
		/* PrintWriter out = resp.getWriter(); */

		String email = req.getParameter("email");
		String password = req.getParameter("pass");

		System.out.println("email recieved is " + email);
		System.out.println("password recieved is " + password);

		/*StringBuilder str = new StringBuilder();
		str.append("<!DOCTYPE html><html><head><title>Document</title>D Flix</head> <body>");
		if (email.equals("dhananjay@gmail.com")) {
			str.append(" <h1>Welcome " + email + "</h1>");

		} else {
			str.append("<h1> Sry wrong credentials try again</h1>");
			str.append("<h3> <a href='login.html'>Login again</h3>");
		}
		str.append("</body>" + "</html>");
		out.print(str);


	}*/
		if(email.equals("dhananjay@gmail.com")&&(password.equals("7090"))) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("movies.html");
			dispatcher.forward(req, resp);
		}
			else {
				RequestDispatcher dispatcher=req.getRequestDispatcher("signup.html");
				dispatcher.forward(req, resp);
			}
	}

}
