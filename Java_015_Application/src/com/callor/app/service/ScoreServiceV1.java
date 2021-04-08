package com.callor.app.service;

import com.kisoo.standard.InputService;
import com.kisoo.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {
	
	InputService isv1;
	Integer kor;
	Integer eng;
	Integer math;
	public ScoreServiceV1() {
		isv1 = new InputServiceImplV1();
		kor = 0;
		eng = 0;
		math = 0;
	}
	public void inputscore() {
		
		kor = isv1.inputValue("국어",0,100);
		if(kor == null) {
			return;
		}
		eng = isv1.inputValue("영어",0,100);
		if(eng == null) {
			return;
		}
		math = isv1.inputValue("수학",0,100);
		if(math == null) {
			return;
		}
				
		
	}
	public void printscore() {
		int intSum = 0;
		float floatAvg = 0.0f;
		
		intSum = kor + eng + math;
		floatAvg = intSum / 3f;
		
		System.out.println("=".repeat(50));
		System.out.printf("국어 : %d\t영어 : %d\t수학 : %d\n",kor, eng, math);
		System.out.println("-".repeat(50));
		System.out.printf("총점 : %d\n",intSum);
		System.out.printf("평균 : %3.2f\n",floatAvg);
		
		
	}

}
