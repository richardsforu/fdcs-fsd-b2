package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

public class OneToOneFetch {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		Employee emp = ses.get(Employee.class, 1025);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());

		System.out.println(emp.getDept().getDeptId());
		System.out.println(emp.getDept().getDeptName());
		System.out.println(emp.getDept().getLocation());

	}

}
