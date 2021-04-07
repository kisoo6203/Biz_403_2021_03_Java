package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	String[] strSub;
	InputServiceV2 inService;
	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;
	int [] scores;
	Integer score;
	int [] members;
	
	public ScoreServiceV5() {
		strSub = new String[] {"국어","영어","수학"};
		inService = new InputServiceV2();
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
		members = new int[5];
	}
	public void inputScore() {
		scores = new int[ strSub.length];
		for(int j = 0 ; j < members.length ; j ++) {
			int num = j+1;
			System.out.println(num + "번의 점수");
			
			for(int i = 0 ; i < strSub.length ; i++) {
				score = inService.inputValue(strSub[i], 0, 100);
				if(score == null) {
					System.out.println("종료");
					return;
				} else if(strSub[i].equals("국어")) {
					kors.add(score);
				} else if(strSub[i].equals("영어")) {
					engs.add(score);
				} else if(strSub[i].equals("수학")) {
					maths.add(score);
				}
				scores[i] = score;
			}
			//	engs.add(score);
				//maths.add(score);
		}
	}
	public void printScore() {
		int intSum;
		float floatAvg;
		System.out.println("=".repeat(50));
		System.out.println();
		
		
	}
		
	
}
