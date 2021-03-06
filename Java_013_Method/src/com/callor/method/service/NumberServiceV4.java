package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("0 ~ 100까지 정수입력");
			System.out.println("QUIT 입력중단");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			Integer intNum = null;

			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {
				// 1. 입력된 값이 QUIT가 아니면 일단
				// 정수로 바꿔보자

				try {
					intNum = Integer.valueOf(strInput);
					} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("값은 숫자만 입력하세요");
					// 다시 입력하는 곳으로 이동시키기
					continue;
				}
				return intNum;

			} // end if "QUIT"
		}

		// return null; // 클래스를 Integer로 만들면 리턴널

	}

}
