package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Actor;

public class Test2 {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();

		CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery(Object.class);

		Root<Actor> root = criteriaQuery.from(Actor.class);

		criteriaQuery.multiselect(root.get("firstName"));
		
		Query<Object> qry = ses.createQuery(criteriaQuery);

		List<Object> actors = qry.getResultList();

		for (Object data : actors) {
			System.out.println(data);
		}

	}

}
