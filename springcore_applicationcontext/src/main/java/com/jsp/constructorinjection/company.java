package com.jsp.constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class company {
	int id;
	String name;
	employee emp;
	public company(@Value("1")int id,@Value("asus") String name, @Autowired employee emp) {
		
		this.id = id;
		this.name = name;
		this.emp = emp;
	}
}
