package com.callor.score;

import com.callor.score.impl.ScoreServiceImplV2Ex;
import com.callor.score.service.ScoreService;

public class ScoreEx_02A {
	
	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceImplV2Ex();
		
		sService.selectMenu();
	}

}
