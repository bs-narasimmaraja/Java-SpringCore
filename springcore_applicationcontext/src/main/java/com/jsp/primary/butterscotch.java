package com.jsp.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
//@primary can be used whenever we have multiple beans for a single unit 
//@primary has less priority than @qualifier
//@primary provides first preference for a bean if there is no @qualifier
//Example :-whenever we have multiple implementing classes for an interface,
//if there is no @qualifier,@primary can be used
public class butterscotch implements icecream{

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("butterscotch is tasty");
	}

}
