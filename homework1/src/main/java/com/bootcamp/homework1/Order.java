package com.bootcamp.homework1;

import java.util.Date;

public class Order {

	private String name;
	private Date orderDate;
	private int quantity;
	
	//constructor
	public Order(String name, Date orderDate, int quantity) {
		super();
		this.name = name;
		this.orderDate = orderDate;
		this.quantity = quantity;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
