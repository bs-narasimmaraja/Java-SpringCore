package com.jsp.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class radionumber {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(configurationclass.class);
	radio r=(radio)context.getBean("radio");
	System.out.println(r.getId());
	System.out.println(r.getBrand());
	System.out.println(r.getPrice());
}
}
