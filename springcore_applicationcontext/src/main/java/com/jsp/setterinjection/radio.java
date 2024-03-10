package com.jsp.setterinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class radio {
	private int id;
	private String brand;
	private double price;
	public int getId() {
		return id;
	}
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	@Value("ganna")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	@Value("1000")
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
