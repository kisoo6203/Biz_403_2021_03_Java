package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

public class ScoreServiceV6 {
	
	String[] subject;
	List<ScoreVO> scoreList;
	int[] scores;
	int members;
	Integer score;
	InputServiceV2 inService;
	public ScoreServiceV6() {
		subject = new String[] {"국어","영어","수학"};
		scoreList = new ArrayList<ScoreVO>();
		members = 5;
		inService = new InputServiceV2(); 
	}
	public void inputValue() {
		scores = new int[ subject.length ];
		for(int i = 0 ; i < members ; i++) {
			int num = i+1;
			System.out.println(num + "번의 점수");
			
			for(int j = 0 ; j < subject.length ; j++) {
				scores[j] = inService.inputValue(subject[i], 0 ,100);
				
			}
			scoreList.add(scores[0]);
			
			
		}
		
		
	}

}
