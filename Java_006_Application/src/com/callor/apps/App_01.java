package com.callor.apps;

import java.util.Random;

/*
 *  정수형 배열을 20개 선언
 *  짝수들의 리스트 출력
 *  짝수들의 합을 계산하여 출력
 */
public class App_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNum = new int[20];
		int intTotal = 0;
		
		System.out.println("===========");
		System.out.println("짝수 리스트");
		
		for(int i = 0 ; i < 20 ; i++) {
			intNum[i] = rnd.nextInt(100)+1;
			
			if(intNum[i] % 2 == 0) {
				intTotal += intNum[i];
				
				System.out.println(intNum[i]);		
			}
			
		}
		System.out.printf("짝수들의 합 : ");
		System.out.println(intTotal);
		
	}
}
