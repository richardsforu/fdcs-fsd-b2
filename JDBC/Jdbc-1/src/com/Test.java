package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root1234");
			//Connection con1 = DriverManager.getConnection("jdbc?;oracle:thin://localhost:1521:orcl","scott","tiger");
			// load ojdbc14.jar
			String q1="insert into product values('P002','Pen',76.45)";
			String q2="insert into product values('P003','Pen',76.45)";

			String q3="insert into product values('P004','Pen',76.45)";

			String q4="insert into product values('P005','Pen',76.45)";

			
			
			Statement stmt=con.createStatement();
			Statement stmt1=con.createStatement();
			Statement stmt2=con.createStatement();
			Statement stmt3=con.createStatement();
			int x=stmt.executeUpdate(q1);
			int x1=stmt1.executeUpdate(q2);
			int x2=stmt2.executeUpdate(q3);
			int x3=stmt3.executeUpdate(q4);
			
			
			System.out.println(x+" records Inserted..");
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
