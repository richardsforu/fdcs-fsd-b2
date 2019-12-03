package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Actor;

public class Test5 {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		String q1 = "select a.actorId,a.firstName from Actor as a where a.firstName like :fn";

		Query<Object[]> qry = ses.createQuery(q1);
		qry.setParameter("fn", "A%");

		List<Object[]> actors = qry.getResultList();

		
		for(int i=0;i<actors.size();i++) {
			Object[] cols=actors.get(i);
			
			for(Object data:cols) {
					System.out.println(data);
			}
			System.out.println("------------------------");
			
		}
		
		

	}

}
