package com.jsp.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class cardriver {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(configurationclass.class);
		car c=(car)context.getBean("car");
		
		engine eng=c.getEng();
		eng.work();
				
				
	}
}
