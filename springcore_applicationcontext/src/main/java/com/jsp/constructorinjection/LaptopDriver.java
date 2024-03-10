package com.jsp.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(classconfiguration.class);
		Laptop l=(Laptop)context.getBean("Laptop");
		System.out.println(l.id);
		System.out.println(l.brand);
		System.out.println(l.price);
	}

}
