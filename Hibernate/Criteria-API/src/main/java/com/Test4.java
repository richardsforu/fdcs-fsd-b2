package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Actor;

public class Test4 {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();

		CriteriaQuery<Actor> criteriaQuery = criteriaBuilder.createQuery(Actor.class);

		Root<Actor> root = criteriaQuery.from(Actor.class);

		criteriaQuery.select(root);
		
		criteriaQuery.where(criteriaBuilder.equal(root.get("actorId"), 1));

		Query<Actor> qry = ses.createQuery(criteriaQuery);

		List<Actor> actors = qry.getResultList();

		for (Actor act : actors) {
			System.out.println(act.getActorId());
			System.out.println(act.getFirstName());
			System.out.println(act.getLastName());
			System.out.println("-------------------------");
		}

	}

}
