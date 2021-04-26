package com.callor.fine;

public class MainEx_07 {
	
	/*
	 * ========================
	 * 5단 구구단
	 * ------------------------
	 * 5 x 1 = 5
	 * 5 x 2 = 10
	 * 5 x 3 = 15
	 * 5 x 4 = 20
	 * 5 x 5 = 25
	 * 5 x 6 = 30
	 * 5 x 7 = 35
	 * 5 x 8 = 40
	 * 5 x 9 = 45
	 * 
	 */
	// 5단 구구단 출력하기
	public static void main(String[] args) {
		int num = 5;
		int sum = 0;
		System.out.println("=".repeat(30));
		System.out.println("5단 구구단");
		System.out.println("-".repeat(30));
		for(int i = 1 ; i < 10 ; i++) {
			sum = i * num;
			System.out.printf("%d x %d = %d\n",num, i, sum);
			
			
		}
		System.out.println("=".repeat(30));
		
	}

}
