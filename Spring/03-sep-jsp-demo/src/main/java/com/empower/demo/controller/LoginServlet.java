package com.empower.demo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String remember=request.getParameter("remember");
		
		System.out.println(username);
		System.out.println(password);
		PrintWriter out = response.getWriter();
		if(remember!=null)
		{
			Cookie cookie1=new Cookie("username", username);
			Cookie cookie2=new Cookie("password1", password);
			cookie1.setMaxAge(1000*60*60*24);
			cookie2.setMaxAge(1000*60*60*24);
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			out.println("You are remembered");
		}
		
		
	}

}
