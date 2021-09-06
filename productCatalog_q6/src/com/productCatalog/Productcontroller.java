package com.productCatalog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Productcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BufferedReader reader;
	@Override
	public void init(ServletConfig config) throws ServletException {
	String filepath=this.getServletConfig().getInitParameter("filePath"); 
	try {
		reader = new BufferedReader(new FileReader(filepath));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String input;
		response.setContentType("text/html");
		while ((input = reader.readLine()) != null) {
			writer.print(input + "<br />");
		}
	}

	

}
