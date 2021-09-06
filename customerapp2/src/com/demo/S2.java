package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S2
 */
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private int counter;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		counter=0;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		counter++;
	PrintWriter out=response.getWriter();
	out.print("counter :"+counter+"<br/>");
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}

	


}
