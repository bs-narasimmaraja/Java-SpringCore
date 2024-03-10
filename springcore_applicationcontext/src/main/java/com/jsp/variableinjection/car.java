package com.jsp.variableinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")//@scope is used to modify the scope of a bean
public class car {
	
	// @value is used to provide default values by the programmer to the properties
	//of the properties of a pojo class
	@Value("1")
	int id;
	@Value("audi")
	String brand;
	@Value("10000")
	double price;
	
	

}
