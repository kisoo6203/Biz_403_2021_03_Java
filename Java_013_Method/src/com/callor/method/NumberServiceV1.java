package com.callor.method;

import java.util.Random;

public class NumberServiceV1 {

	int[] intNum;
	public NumberServiceV1() {
		intNum = new int[100];
				
	}
	public void inputNum() {
		Random rnd = new Random();
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100)+1;
		}
		
	}
	public void printNum() {
		System.out.println();
		System.out.println("=".repeat(50));
		
		for(int i = 0 ; i < intNum.length ; i ++) {
			if(intNum[i] % 3 == 0) {
				System.out.println(intNum[i] +"는 3의 배수");
			
			} else {
				return;
			} 
		}
		
	}
	
}
