package com.jsp.constructorinjection;

import org.springframework.beans.factory.annotation.Value;

public class Laptop {
	int id;
	String brand;
	double price;
	public Laptop(@Value("1")int id,@Value("Asus") String brand, @Value("1000")double price) {
			this.id = id;
		this.brand = brand;
		this.price = price;
	}
	
	

}
