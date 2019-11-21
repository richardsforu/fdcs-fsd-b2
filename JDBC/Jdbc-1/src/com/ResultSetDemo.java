package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root1234");
			
			String q1="select product_name ,product_id,price from product";
			Statement stmt=con.createStatement();
			//CallableStatement cs=con.prepareCall("? call f1(?");
			ResultSet rs=stmt.executeQuery(q1);
			
		
			while(rs.next()) {
				System.out.println(rs.getString("product_id"));
				System.out.println(rs.getString("product_name"));
				System.out.println(rs.getDouble("price"));
				System.out.println("-----------------------");
			}
			
			

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
