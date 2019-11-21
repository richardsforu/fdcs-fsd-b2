package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root1234");
			//Connection con1 = DriverManager.getConnection("jdbc?;oracle:thin://localhost:1521:orcl","scott","tiger");
			// load ojdbc14.jar
			
			String id="P004";
			String produtName="Mobile";
			double price=2500;
			
			
		//	String q1="update product set product_name='Mac Book Pro',price=15000 where product_id='P003'";
		
			//String q1="update product set product_name='"+produtName+"',price="+price+" where product_id='"+id+"'";
			String q1="update product set product_name=?,price=? where product_id=?";
			System.out.println(q1);
			
			
			PreparedStatement ps=con.prepareStatement(q1);
			
			ps.setString(1, produtName);
			ps.setDouble(2, price);
			ps.setString(3, id);
			
			
			
		
			int x=ps.executeUpdate();
			
			System.out.println(x+" records Updated..");
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
