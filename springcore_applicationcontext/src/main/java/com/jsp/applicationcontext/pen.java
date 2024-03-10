package com.jsp.applicationcontext;

import org.springframework.stereotype.Component;

@Component //@component is used mark a class as a component class.
//Ioc container creates objects for the component classes 
//@component annotation is used to specify pojo class to the ioc container
//In application context,@component will be used instead of <bean> tag
//@component is a class level annotation
public class pen {
	
	public pen() {
		System.out.println("pen constructor is invoked");
	}
	public void work() {
		System.out.println("pen is writing");
	}
}
