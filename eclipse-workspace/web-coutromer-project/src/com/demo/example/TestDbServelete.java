package com.demo.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class TestDbServelete
 */
@WebServlet("/TestDbServelete")
public class TestDbServelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user="hbstudent";
		String password="hbstudent";
		
		
				
				String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
				String driver="com.mysql.jdbc.driver";
				
				try {
					PrintWriter out=response.getWriter();
					out.println("connecitn to jdbc url"+jdbcUrl);
					Class.forName(driver);
					
					
					Connection mycon=DriverManager.getConnection(jdbcUrl,user,password);
					out.println("connection success!!!");
					System.out.println();
				} catch (SQLException e) {
					
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
				
					e.printStackTrace();
				}
				System.out.println("connection success");
						
				
	}

}
