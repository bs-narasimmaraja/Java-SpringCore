package com.jsp.variableinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.applicationcontext.classconfiguration;
public class mobiledriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new AnnotationConfigApplicationContext(classconfiguration.class);
		
		mobile m=(mobile)ac.getBean("mobile");
		battery b=m.bat;
		b.work();
		
	}

}
