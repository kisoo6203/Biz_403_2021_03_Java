package com.callor.arrays;

import java.util.Random;

public class Aray_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		// 정수값 100개를 저장할 변수를 선언하라
		// 정수형 "배열" 100개를 선언하라
		int[] intKors = new int[100];
		
		for(int i = 0 ; i < 100 ; i++) {
			// intKors[0] = rnd.nextInt(100) + 1+
			//	:
			// intKors[0] = rnd.nextInt(100) + 1+
			intKors[i] = rnd.nextInt(100) + 1;
		}
		int intSum = 0;
		Float floatAvg = 0f;
		for(int i = 0 ; i < 100 ; i++) {
			//intSum += intKors[0]
			//		:
			//intSum += intKors[99]
			intSum += intKors[i];
			floatAvg = intSum / 100f;
		}
		for(int i = 0 ; i < 100 ; i++) {
			System.out.printf("학생 %d : %d\n",i+1,intKors[i]);
		}
		System.out.println("-------------------------------");
		System.out.printf("총점:%d, 평균:%3.2f", intSum, floatAvg);
	}
}
