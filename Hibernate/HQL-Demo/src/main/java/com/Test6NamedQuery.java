package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Actor;

public class Test6NamedQuery {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		String q1 = "from Actor";

		Query<Actor> qry = ses.getNamedQuery("q2");
		

		List<Actor> actors = qry.getResultList();

		for (Actor act : actors) {
			System.out.println(act.getActorId());
			System.out.println(act.getFirstName());
			System.out.println(act.getLastName());
			System.out.println("-------------------------");
		}

	}

}
