package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		//Department dept = new Department();
		//dept.setDeptId(10);
		//dept.setDeptName("IT");
		//dept.setLocation("Pune");
		
		Department dept=ses.get(Department.class, 10);
		

		Employee emp = new Employee();

		
		emp.setEmpId(1026);
		emp.setEmpName("Praveen");
		emp.setSalary(23244);
		if(dept!=null)
		emp.setDept(dept);
		else
			throw new NullPointerException("Department Id  Does not Exits in DB");
		

		ses.save(emp);

		ses.beginTransaction().commit();
		System.out.println("--- Done ---");

	}

}
