package com.jsp.beandefinition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@configuration is used to specify the source of bean definitions to ioc container
@ComponentScan(basePackages ="com.jsp.beandefinition")
public class classconfig {
		// @bean is  used to get the instance if third party classes
		//or
	// @bean is used to get the instances of the classes which are not annoatated with
	//@component
	//@bean is majorly used to get the instance of inbuilt or pre defined classes
	@Bean("objb")
	public B getB() {
		return new B();
	}
}
