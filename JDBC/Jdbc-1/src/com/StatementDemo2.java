package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementDemo2 {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root1234");
			//Connection con1 = DriverManager.getConnection("jdbc?;oracle:thin://localhost:1521:orcl","scott","tiger");
			// load ojdbc14.jar
			
			String id="P001";
			String produtName="Samsung Mobile";
			double price=95000;
		//	String q1="update product set product_name='Mac Book Pro',price=15000 where product_id='P003'";
		
			String q1="update product set product_name='"+produtName+"',price="+price+" where product_id='"+id+"'";
			System.out.println(q1);
			
			
			Statement stmt=con.createStatement();
		
			int x=stmt.executeUpdate(q1);
			
			System.out.println(x+" records Updated..");
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
