package com.callor.score;

import com.callor.score.impl.ScoreServiceImplV2;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
//		ScoreVO scoreVO = new ScoreVO();
//		System.out.println(scoreVO.toString());
		
		ScoreServiceImplV2 ssV2 = new ScoreServiceImplV2();
		ssV2.selectMenu();
		
	}

}
