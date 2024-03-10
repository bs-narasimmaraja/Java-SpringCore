package com.jsp.beandefinition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class driver {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(classconfig.class);
	B b=(B)context.getBean("objb");
	b.m();
	
	
}


}
