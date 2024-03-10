package com.jsp.constructorinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class employee {
	int id;
	String name;
	String role;
	public employee(@Value("1")int id,@Value("rakesh") String name,@Value("developer") String role) {
	
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	
}
