package com.callor.method.service;

public class ScoreServiceV1 {
	
	InputNumberV1 inNumber;
	public ScoreServiceV1() {
	inNumber = new InputNumberV1();
	}
	
	public Integer inputScore() {
		
		inNumber.inputValue("국어", 0, 100);
		
		
		return null;
	}

}
