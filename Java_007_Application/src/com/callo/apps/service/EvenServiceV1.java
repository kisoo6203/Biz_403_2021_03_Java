package com.callo.apps.service;

import java.util.Random;

// 클래스 선언문(시작하는 곳)
public class EvenServiceV1 {

	int[] intNum;
	
	public EvenServiceV1() {
		intNum = new int[100];
	}
	
	public void makeNums() {
		Random rnd = new Random();
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		
		}
				
	}
	public void printPrime() {
		int intSum = 0;
		int nCount = 0;
		System.out.println("=====================================");
		System.out.println("짝수들 리스트");
		System.out.println("-------------------------------------");
		for(int i = 0 ; i < intNum.length ; i++) {
			if(intNum[i] % 2 == 0) {
				intSum += intNum[i];
				
				System.out.printf("%d, ",intNum[i]);
						
				nCount++;
				if (nCount % 10 == 0) {
					System.out.printf("\n");
				}
				
				
							
			}
		}
		System.out.printf("\n====================================");
		System.out.printf("\n짝수들의 합 : ");
		System.out.println(intSum);
		
			
			
			
		
		
		
	}
	
}
