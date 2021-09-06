package com.customer.webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoHttpSession
 */
public class DemoHttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession httpSession=request.getSession();
		Integer counter=(Integer) httpSession.getAttribute("counter");
		if(counter==null) {
			counter=1;
			httpSession.setAttribute("counter", counter);
			out.print("welcome first time user");
			
		}else {
			counter++;
			httpSession.setAttribute("counter", counter);
			out.print("welcome again, you have visited "+counter);
		}
	}

}
