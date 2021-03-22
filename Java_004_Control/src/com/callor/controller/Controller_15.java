package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intKor1 = 0;
		int intKor2 = 0;
		int intKor3 = 0;
		int intKor4 = 0;
		int intKor5 = 0;
		int intKor6 = 0;
		int intKor7 = 0;
		int intKor8 = 0;
		int intKor9 = 0;
		int intKor10 = 0;
		int intSum = intKor1 + intKor2 + intKor3 + intKor4 + intKor5 + intKor6 + intKor7 + intKor8 + intKor9 + intKor10;
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt(100) + 1;
			int num2 = rnd.nextInt(100) + 1;
			int num3 = rnd.nextInt(100) + 1;
			int num4 = rnd.nextInt(100) + 1;
			int num5 = rnd.nextInt(100) + 1;
			int num6 = rnd.nextInt(100) + 1;
			int num7 = rnd.nextInt(100) + 1;
			int num8 = rnd.nextInt(100) + 1;
			int num9 = rnd.nextInt(100) + 1;
			int num10 = rnd.nextInt(100) + 1;
			intSum += num;
			
									
		}
		System.out.printf("학생1 : %d\n", intKor1);
		System.out.printf("학생2 : %d\n", intKor2);
		System.out.printf("학생3 : %d\n", intKor3);
		System.out.printf("학생4 : %d\n", intKor4);
		System.out.printf("학생5 : %d\n", intKor5);
		System.out.printf("학생6 : %d\n", intKor6);
		System.out.printf("학생7 : %d\n", intKor7);
		System.out.printf("학생8 : %d\n", intKor8);
		System.out.printf("학생9 : %d\n", intKor9);
		System.out.printf("학생10 : %d\n", intKor10);
		
		
	}
}
