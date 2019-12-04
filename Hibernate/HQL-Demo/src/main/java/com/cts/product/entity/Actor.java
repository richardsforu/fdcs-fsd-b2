package com.cts.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "actor_fetch",query = "from Actor")
@NamedQueries(value = {@NamedQuery(name="q1",query = "from Actor as a where a.actorId<=5"),
					   @NamedQuery(name="q2",query = "from Actor as a where a.actorId between 1 and 10")})
public class Actor {

	@Id
	@Column(name = "actor_id")
	private int actorId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
