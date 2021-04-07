package com.callor.method.service;

public class ScoreServiceV3 {
	InputServiceV2 inService;

	int intSum;
	float floatAvg;
	public ScoreServiceV3() {
		inService = new InputServiceV2();
	}
	public void inputScore() {
		Integer intKor = inService.inputValue("국어",0,100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = inService.inputValue("영어",0,100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = inService.inputValue("수학",0,100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}
		intSum = intKor + intEng + intMath;
		floatAvg = intSum / 3.0f;
		
		System.out.println("=".repeat(30));
		System.out.printf("국어 점수 = %d\n",intKor);
		System.out.printf("영어 점수 = %d\n",intEng);
		System.out.printf("수학 점수 = %d\n",intMath);
		System.out.println("-".repeat(30));
		System.out.printf("총점 = %d\n",intSum);
		System.out.printf("평균 = %2.2f\n",floatAvg);
		System.out.println("=".repeat(30));
		
		
	}

}
