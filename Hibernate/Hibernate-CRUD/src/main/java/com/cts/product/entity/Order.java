package com.cts.product.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="Orders")
@GenericGenerator(name = "myGen",strategy = "com.cts.product.entity.CustomPKGenerator")
public class Order {

	@Id
	@GeneratedValue(generator = "myGen")
	private String orderId;
	private LocalDate orderDate;
	private int quantity;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
