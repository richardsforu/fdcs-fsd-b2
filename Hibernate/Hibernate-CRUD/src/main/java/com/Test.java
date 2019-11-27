package com;
import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;
import com.cts.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		Session ses=DBConfig.getSessionFactory().openSession();
	
		
		// ---------------------------------

		Employee emp=new Employee();
		emp.setEmpId("Emp002");
		emp.setEmpName("Pravee");
		emp.setSalary(3242434);
		
		ses.save(emp);
		
		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
