package com.nguyenanhtu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nguyenanhtu.order.Order;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Configuration.xml");
		Order order = (Order) appContext.getBean("bean3");
		order.Show();
		Customer customer = (Customer) appContext.getBean("beanCust1");
		customer.Show();
		Address address = appContext.getBean(Address.class);
		address.Show();
	}
}
