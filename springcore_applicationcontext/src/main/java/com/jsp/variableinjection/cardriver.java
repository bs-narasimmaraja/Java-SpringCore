package com.jsp.variableinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.applicationcontext.classconfiguration;

public class cardriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(classconfiguration.class);
		car c=(car)context.getBean("car");
		
		System.out.println(c.id);
		System.out.println(c.brand);
		System.out.println(c.price);
		
		car c1=(car)context.getBean(null)
		
				
	}

}
