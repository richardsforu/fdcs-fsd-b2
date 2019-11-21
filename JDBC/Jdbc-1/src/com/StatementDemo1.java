package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementDemo1 {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root1234");
			//Connection con1 = DriverManager.getConnection("jdbc?;oracle:thin://localhost:1521:orcl","scott","tiger");
			// load ojdbc14.jar
		
			long st=System.currentTimeMillis();
	
			Statement stmt=con.createStatement();
			for(int i=1;i<=20000;i++) {
				String q1="insert into f1 values('P0"+i+"')";
				stmt.executeUpdate(q1);
			}
			
			long et=System.currentTimeMillis();
			
			System.out.println("Total Time: "+(et-st));
			
		
			//int x=stmt.executeUpdate(q1);
			
			//System.out.println(x+" records Updated..");
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
