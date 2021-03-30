package com.callor.classes;

import java.util.Random;

public class Class_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNum = new int[50]; 
		System.out.println("===================");
		for(int i = 2 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(51)+50;
			if(intNum[i] % i == 0) {
				
				System.out.printf("%d 은(는) %d의 약수\n", intNum[i], i);
			}
		}
		
	}
	
}
