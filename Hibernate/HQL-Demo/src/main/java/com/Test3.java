package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Actor;

public class Test3 {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		String q1 = "select a.firstName from Actor as a";

		Query<Object> qry = ses.createQuery(q1);

		List<Object> actors = qry.getResultList();

		for (Object data : actors) {
			System.out.println(data);
		}

	}

}
