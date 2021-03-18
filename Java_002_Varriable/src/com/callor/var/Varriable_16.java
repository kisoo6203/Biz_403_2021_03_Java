package com.callor.var;

public class Varriable_16 {

	public static void main(String[] args) {
		
		int dan = 3;
		
		System.out.printf(dan + " x 1 = %d\n", dan * 1);
		System.out.printf(dan + " x 2 = %d\n", dan * 2);
		System.out.printf(dan + " x 3 = %d\n", dan * 3);
		System.out.printf(dan + " x 4 = %d\n", dan * 4);
		System.out.printf(dan + " x 5 = %d\n", dan * 5);
		System.out.printf(dan + " x 6 = %d\n", dan * 6);
		System.out.printf(dan + " x 7 = %d\n", dan * 7);
		System.out.printf(dan + " x 8 = %d\n", dan * 8);
		System.out.printf(dan + " x 9 = %d\n", dan * 9);
		
		int intDan = 0;
		int intNum = 0;
		
		// 3단을 표시하기 위한 변수
		intDan = 3;
		// 2~9까지의 숫자를 만들고
		// 실제 구구단을 계산하고 출력하기 위한 변수
		intNum = 1;
		System.out.println("========================");
		//                           %2d => 출력되는 값이 2번째칸에 표시
		System.out.printf("%d x %d = %2d\n", intDan, intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan*intNum);
		
		
		
		
		
	}
	
}
