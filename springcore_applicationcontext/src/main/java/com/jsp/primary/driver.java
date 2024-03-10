package com.jsp.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class driver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		baby b=(baby)context.getBean("baby");
		b.eat();
	}
}
