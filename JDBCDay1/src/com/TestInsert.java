package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class TestInsert {

	public static void main(String[] args) throws Exception {
      Scanner   sc=new Scanner(System.in);
		System.out.println("Enter Rollno");
		int rollno=sc .nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        //String sql="insert into student values(1,'abc')";
		String sql="insert into student values("+rollno+",'"+name+"')";
		
		         Statement smt   =con.createStatement();
		         
		   int value  = smt.executeUpdate(sql);
	
		   if(value==1) {
		System.out.println("data successfully added..");
	
		   }else {
		System.out.println("invalid data");
	
		   }
		}

}
