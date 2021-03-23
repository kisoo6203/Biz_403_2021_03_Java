package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		// 과목 3가지를 학생 수만큼 배열을 선언
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		int intTotal = 0;
		float floatAvg = 0.0f;
		int intNum = 0;
		int intKorTotal = 0;
		int intEngTotal = 0;
		int intMathTotal = 0;
		int intAllTotal = 0;
		float floatAllAvg = 0.0f;

		intNum++;
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		// 가상의 점수를 생성하기
		for (int i = 0; i < 5; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;

			intTotal = intKor[i];
			intTotal += intEng[i];
			intTotal += intMath[i];
			floatAvg = intTotal / 3f;
			
			intKorTotal += intKor[i];
			intEngTotal += intEng[i];
			intMathTotal += intMath[i];
			intAllTotal += intTotal;

			System.out.printf("%d\t%d\t%d\t%d\t%d\t%3.2f\n",
					intNum++, intKor[i], intEng[i], intMath[i], intTotal,
					floatAvg);

		}
		System.out.printf("총점\t%d\t%d\t%d\t%d", 
				intKorTotal, intEngTotal, intMathTotal, intAllTotal);

	}
}
