package com.jsp.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class baby {
	@Autowired
	@Qualifier("vanilla")//@qualifier annotation is used to specify the specific bean,
	//when there are multiple matching beans for a single unit.
	//@qualifier has more  than @primary annotation.
	//example:-whenever we have multiple implementing classes for an interface,we have
	//to instatiate the specipriorityfic implementing class object.we use @qualifier annoation.
	icecream cream;
	 
	public void eat() {
		System.out.println("baby is eating icecream");
		cream.taste();
		System.out.println("baby stopped crying ");
	}
}
