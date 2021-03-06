package com.callor.apps;

public class Pay_01 {

	public static void main(String[] args) {
		
		int nPay = 3_723_560; // 금액
		int nPaper = 50_000; // 최고액면가 화폐
		
		// 정수 = 정수 / 정수 : 소수점이하가 출력x
		// 몫을 구하여 액면가액 만큼 개수를 계산
		int nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		
		// 액면가액만큼 개수를 구했으면
		// nPay에서 액면가액 금액만큼을 빼고 이후에 계산
		// 3723560 % 50000 => 5만원권 매수 * 매수 만큼을
		// 			3723560에서 뺀금액
		// nPay = nPay - (nPaper * nCount)
		nPay %= nPaper;
		nPaper /= 5;
		System.out.println(nPay);
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		int A = 1000;
		int B = 15;
		int C = 1000;
		
		
		A/=B;
		C%=B;
		System.out.println(A);
		System.out.println(C);
	}
}
