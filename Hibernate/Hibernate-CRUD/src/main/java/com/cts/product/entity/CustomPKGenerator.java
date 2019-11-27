package com.cts.product.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomPKGenerator  implements IdentifierGenerator{
	
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		Random r=new Random();
		//r.nextInt();
		LocalDateTime cp=LocalDateTime.now();
		ZonedDateTime zdt = cp.atZone(ZoneId.of("America/Los_Angeles"));
		long millis = zdt.toInstant().toEpochMilli();
		
		return "ABC01"+millis+Math.abs(r.nextInt(1000000000));
	}

}
