package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class Keyinput_03A {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		int lineLength = 30;
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("두수의 4칙연산");
		System.out.println(LinesService.dLines(lineLength));
		System.out.print("정수1 >> ");
		int num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		int num2 = scan.nextInt();
		System.out.println(LinesService.sLines(lineLength));
		System.out.printf("\t%d + %d = %d\n", num1,num2,num1+num2);
		System.out.printf("\t%d - %d = %d\n", num1,num2,num1-num2);
		System.out.printf("\t%d * %d = %d\n", num1,num2,num1*num2);
		System.out.printf("\t%d / %d = %d\n", num1,num2,num1/num2);
		System.out.println(LinesService.sLines(lineLength));
	}
	
}
