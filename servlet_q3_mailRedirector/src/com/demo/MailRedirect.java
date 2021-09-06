package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MailRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter=request.getParameter("fav_mail");
		if(parameter.equals("unknown")) {
			response.sendRedirect("404.jsp");
		}else {
			response.sendRedirect("https://www."+parameter+".com");
		}
		
	}

	

}
