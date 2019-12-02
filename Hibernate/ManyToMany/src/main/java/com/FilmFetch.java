package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Actor;
import com.cts.product.entity.Film;

public class FilmFetch {
	
	public static void main(String[] args) {
		
		Session ses=DBConfig.getSessionFactory().openSession();
		
		Actor actor=ses.get(Actor.class, 2);
		
		System.out.println(actor.getActorId());
		System.out.println(actor.getFirstName());
		System.out.println(actor.getLastName());
		
		for(Film film:actor.getFilms()) {
			System.out.println(film.getFilmId());
			System.out.println(film.getTitle());
			System.out.println(film.getDescription());
			System.out.println("-----------------------------------");
		}
		
		
	}

}
