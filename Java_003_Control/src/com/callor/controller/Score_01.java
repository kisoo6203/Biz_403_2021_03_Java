package com.callor.controller;

public class Score_01 {

	public static void main(String[] args) {
		
		String strKor = "국어";
		String strEng = "영어";
		String strMath = "수학";
		
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		intKor = 80;
		intEng = 77;
		intMath = 65;
		
		int intSum = 0;
		int intAvg = 0;
		
		intSum = intKor + intEng + intMath;
		intAvg = intSum / 3;
		
		System.out.println("====================");
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("--------------------");
		
		System.out.println("총점 : " + intSum + " 평균 : " + intAvg );
		System.out.println("====================");
		
		/*
		 * printf() 사용하여 출력할때
		 * %d : 정수(10진수)
		 * 		%3d : 자릿수를 3개로 맞추고 값을 오른쪽정렬
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 2째자리까지 표시
		 * %s : 문자열
		 * 
		 *\n : Enter를 누른것처럼 줄바꿈실행
		 *\t : Tab키를 누른것처럼 사이띄기를
		 *		일정하게 맞추어라
		 *가	나
		 *가나	다
		 *1		2
		 *123	3
		 */
				
		
		
	}
	
}
