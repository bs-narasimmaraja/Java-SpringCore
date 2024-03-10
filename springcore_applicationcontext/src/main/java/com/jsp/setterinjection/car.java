package com.jsp.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car {
	
	private engine eng;

	public engine getEng() {
		return eng;
	}
	@Autowired
	public void setEng(engine eng) {
		this.eng = eng;
	}

}
