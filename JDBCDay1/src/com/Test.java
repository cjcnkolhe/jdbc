package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		// step 1: load the driver
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		// step 2 establish connection with database
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		//step 3  construct the sql query
		
		String sql="create table student(rollno int primary key,name varchar(30))";
		
	// step 4  create Object of Statment
		    Statement smt  = con.createStatement();
		    
	// step 5 execute sql query
		       smt.execute(sql);
		       
  // step6 closing the resources		       
		    smt.close();
		    con.close();
		
		
		
	}

}
