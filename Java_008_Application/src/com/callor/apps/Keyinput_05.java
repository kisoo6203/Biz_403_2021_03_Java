package com.callor.apps;

import java.util.Scanner;

public class Keyinput_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		
		System.out.println("==================");
		System.out.println("정수를 입력하세요");
		System.out.print(">> ");
		num1 = scan.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.printf("%d 은(는) 짝수입니다\n", num1);
				
		} else {
			System.out.printf("%d 은(는) 짝수가아닙니다\n", num1);
		}
		
		



			

		
	}
	
}
