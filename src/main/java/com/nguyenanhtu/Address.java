package com.nguyenanhtu;

public class Address {

	String address;

	Address(String address){
		this.address = address;
	}
	
	Address(String address, int z, int zz, String s){
		this.address = address;
	}
	
	public void Show() {
		System.out.println("*address: " + address);
	}
	
	public String getAddress() {
		return address;
	}
	
}
