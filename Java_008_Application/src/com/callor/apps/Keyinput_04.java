package com.callor.apps;

import java.util.Scanner;

public class Keyinput_04 {

	public static void main(String[] args) {
		
		int[] intnum = new int[5];
		Scanner scan = new Scanner( System.in );
		int intSum = 0;
		
		for(int i = 0 ; i < intnum.length ; i++) {
		System.out.printf("%d 번째 정수\n", i + 1);
		System.out.printf("정수 >> ", i + 1);

		int num1 = scan.nextInt();
        
        intnum[i] = num1;
        intSum += intnum[i];
		}
	    
	    System.out.print("정수들의 합 : ");
	    System.out.println(intSum);
	    
		
	}
	
}
