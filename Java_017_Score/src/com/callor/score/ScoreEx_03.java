package com.callor.score;

import com.callor.score.impl.ScoreServiceImplV3;
import com.callor.score.service.ScoreService;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV3();
		sService.selectMenu();
		
	}

}
