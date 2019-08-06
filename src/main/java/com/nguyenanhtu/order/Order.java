package com.nguyenanhtu.order;

import com.nguyenanhtu.Address;

public class Order {
	Long id;
	Address addressOrder;
	String nameOrder;	
	public Order(Long id, Address tmp, String name) {
		this.id = id;
		this.addressOrder = tmp;
		nameOrder = name;
	}
	public Address getAddressOrder() {
		return addressOrder;
	}
	public Long getId() {
		return id;
	}
	public String getNameOrder() {
		return nameOrder;
	}
	public void Show() {
		System.out.println(id + " " + nameOrder);
		if (addressOrder != null) 
			System.out.println("addressOrder: " + addressOrder.getAddress());
	}
}
class Want {
	public static void Show() {
	}
}
