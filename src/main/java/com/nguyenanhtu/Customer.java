package com.nguyenanhtu;

import java.util.List;

import com.nguyenanhtu.order.Order;

public class Customer {
	int id;
	
	String name;
	
	List<Order> orders;

	List<String> comments;
	
	Address address;
	
	public Customer(int id, String na, List<Order> order, List<String> st) {
		this.id = id;
		this.name = na;
		this.orders = order;
		this.comments = st;
	}
	
	public List<String> getComments() {
		return comments;
	}

	public Address getAddress() {
		return address;
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setAddress(Address ad) {
		this.address = ad;
	}

	public void Show() {
		System.out.println("*******");
		System.out.println(name);
		orders.forEach(x -> x.Show());
		comments.forEach(x -> System.out.println(x));
		
		System.out.println("adddress: " + address.getAddress());
		
		System.out.println("*******");
	}
	
}
