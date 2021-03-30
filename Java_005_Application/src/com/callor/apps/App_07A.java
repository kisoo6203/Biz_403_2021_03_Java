package com.callor.apps;

public class App_07A {

	public static void main(String[] args) {
		
		int intNum = 3_385_859;
		/*
		 * intNum의 자릿수가 얼마인가?
		 */
		int nCount = 0;
		System.out.println(intNum);
		while(true) {
			
			nCount++;
			// intNum = intNum % 1-
			// intNum 값과 10을 나머지 연산을 수행하고
			// intNu / 10 => 3385859 / 10 = 338585.9
			intNum /= 10; // 9
			System.out.println(intNum);
			//while() { } 반복문을 끝내기 위한
			// 		비교 연산 명령문
			//		intNum가 0이하이면 반복문을 끝내라
			// 이 명령 대신 조건문을 반대로 설정하여
			// while(조건)으로 실행한다
			// if(intNum < 0 ) {
			 break;
			System.out.printf(intNum + " 는 ",  nCount + " 자릿수");
			
			}
		
		}
		
		
		
	
}
