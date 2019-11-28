package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		Department d1 = new Department();
		d1.setDeptId(10);
		d1.setDeptName("Accounts");
		d1.setLocation("Chennai");

		Department d2 = new Department();
		d2.setDeptId(11);
		d2.setDeptName("HR");
		d2.setLocation("Hyderabad");

		Employee e1 = new Employee(1024, "Praveen", 15000);
		Employee e2 = new Employee(1025, "James", 12000);
		Employee e3 = new Employee(1026, "Ria", 19000);
		Employee e4 = new Employee(1027, "Ruth", 25000);
		Employee e5 = new Employee(1028, "Bucky", 65000);
		Employee e6 = new Employee(1029, "Maria", 95000);

		d1.getEmps().add(e1);
		d1.getEmps().add(e2);
		d1.getEmps().add(e3);
		d1.getEmps().add(e4);

		d2.getEmps().add(e5);
		d2.getEmps().add(e6);
		

		ses.save(d1);
		ses.save(d2);

		ses.beginTransaction().commit();

		System.out.println("--- Done ");

	}

}
