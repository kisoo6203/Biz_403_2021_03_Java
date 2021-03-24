package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {
		
		int[] intNums = new int[20];
		Random rnd = new Random();
		
		for(int i = 0 ; i < 20 ; i++) {
			intNums[i] = rnd.nextInt(100)+1;
		   if(intNums[i] % 2 == 0) {
			   System.out.printf("[%d] = %d\n",i , intNums[i]);
		   }
			
		}
	
		
			
		
			
		
	}
}
