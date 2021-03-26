package com.callor.apps;

import java.util.Scanner;

public class Keyinput_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		System.out.println("\t4칙연산 수행 (+,-,*,/)");
		System.out.print("\t정수 >> ");
		int num1 = scan.nextInt();
		
		System.out.print("\t정수 >> ");
		int num2 = scan.nextInt();
		
		System.out.println();
		System.out.println("\t더하기(+)");
		System.out.printf("\t%d + %d = %d\n", num1,num2,num1+num2);
		System.out.println();
		System.out.println("\t빼기(-)");
		System.out.printf("\t%d - %d = %d\n", num1,num2,num1-num2);
		System.out.println();
		System.out.println("\t곱하기(*)");
		System.out.printf("\t%d * %d = %d\n", num1,num2,num1*num2);
		System.out.println();
		System.out.println("\t나누기(/)");
		System.out.printf("\t%d / %d = %d\n", num1,num2,num1/num2);
		
		
	}
	
}
