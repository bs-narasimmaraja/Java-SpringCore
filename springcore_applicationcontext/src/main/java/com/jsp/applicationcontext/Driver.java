package com.jsp.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(classconfiguration.class);
	pen p=(pen)context.getBean("pen");
	p.work();
}
}