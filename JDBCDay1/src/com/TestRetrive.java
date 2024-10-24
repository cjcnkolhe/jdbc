package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestRetrive {

	public static void main(String[] args) throws Exception
	{

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		String sql="select * from student where rollno=1";
		
		Statement smt=con.createStatement();
		
		   ResultSet  rs   =smt.executeQuery(sql);
		        
		          if(rs.next())
		          {
		        	  System.out.println(rs.getInt(1));
			          System.out.println(rs.getString(2));
			        
		          }
		          
		   
		   
	}

}
