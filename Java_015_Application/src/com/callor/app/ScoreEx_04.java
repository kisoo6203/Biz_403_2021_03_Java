package com.callor.app;


import com.callor.app.service.ScoreService2;
import com.callor.app.service.impl.ScoreServiceImplV1A;

public class ScoreEx_04 {
	
	public static void main(String[] args) {
		
		ScoreService2 sService = new ScoreServiceImplV1A();
		sService.selectMenu();
		
	}

}
