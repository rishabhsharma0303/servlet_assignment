package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String nameparam=this.getServletConfig().getInitParameter("username");
		String passparam=this.getServletConfig().getInitParameter("password");
		
		if(username.equals(nameparam) && password.equals(passparam)) {
		out.print("username and password are validated");
		}else {
			int count = Integer.valueOf(this.getServletContext().getInitParameter("count"));
			while (count-- != 0) {
				out.print("Wrong Parameter => Username : " + username + " , Password : " + password + " <br/>");
			}
		}
		
		
	}

}
