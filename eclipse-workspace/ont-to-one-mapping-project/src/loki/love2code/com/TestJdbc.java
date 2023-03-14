package loki.love2code.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		
		String user="hbstudent";
		String password="hbstudent";
		System.out.println("sdfskdfjskdf");
	
			System.out.println("connting to data base"+jdbcUrl);
			try {
				Connection mycon=DriverManager.getConnection(jdbcUrl,user,password);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			System.out.println("connection success");
					
		
	}

}
