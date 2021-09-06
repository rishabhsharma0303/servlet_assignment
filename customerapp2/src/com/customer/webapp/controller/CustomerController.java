package com.customer.webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customer.dao.Customer;
import com.customer.dao.CustomerDao;
import com.customer.dao.CustomerDaoImpl;
import com.customer.exceptions.DataAccessException;

import java.util.*;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDao customerService=new CustomerDaoImpl();
	@Override
	/*
	 * public void init(ServletConfig config) throws ServletException { // TODO
	 * Auto-generated method stub super.init(config); try {
	 * Class.forName("com.mysql.jdbc.Driver");
	 * System.out.println("---------driver is loaded----------");
	 * }catch(ClassNotFoundException ex) {
	 * 
	 * } }
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		
//		try {
//			Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/yms21","root","root");
//		}catch(SQLException ex) {
//			
//		}
//		name
//		address
//		mobile
//		email
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		Connection  connection=null;
//		try {
//			  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/yms21","root","root");
//			PreparedStatement pstmt=connection.prepareStatement("insert into customer(name,address,mobile,email) values(?,?,?,?)");
//			pstmt.setString(1, name);
//			pstmt.setString(2, address);
//			pstmt.setString(3, mobile);
//			pstmt.setString(4, email);
//			pstmt.executeUpdate();
//	
//		}catch(SQLException ex) {
//			
//		}finally {
//			if(connection!=null) {
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
		PrintWriter out=response.getWriter();
		
Customer customer=new Customer(name, address, mobile, email);
		
		try{
			customerService.addCustomer(customer);
		}catch(DataAccessException ex) {
			System.out.println(ex.getMessage());
		}
		//request.setAttribute("customer", customer);

		HttpSession httpSession=request.getSession();
		
		httpSession.setAttribute("customer", customer);
		response.sendRedirect("Success.jsp");
//		out.print("you are registered"+"<br/>");
//		out.print("name:"+name+"<br/>");
//		out.print("address:"+address+"<br/>");
//		out.print("mobile:"+mobile+"<br/>");
//		out.print("email:"+email+"<br/>");

	}

	

}
