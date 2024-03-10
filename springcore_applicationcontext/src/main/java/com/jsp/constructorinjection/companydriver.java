package com.jsp.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class companydriver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(classconfiguration.class);
		
	company com=(company)context.getBean("company");
	employee em=com.
	
	System.out.println(em.id);
	System.out.println(em.name);
	System.out.println(em.role);
	System.out.println(com.id);
	System.out.println(com.name);
	
	}
}
