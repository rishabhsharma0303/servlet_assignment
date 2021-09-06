package com.customer.webapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customer.dao.User;
import com.customer.dao.UserDao;
import com.customer.dao.UserDaoImpl;
import com.customer.exceptions.UserNotFoundException;

/**
 * Servlet implementation class Logincontroller
 */
public class Logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDao userDao=new UserDaoImpl();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		try{
			User user=userDao.getUser(username, password);
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("user", user);
			response.sendRedirect("customerController.do");
			
		}catch(UserNotFoundException ex) {
			response.sendRedirect("login.jsp?error=login failed");
		}
	}

}
