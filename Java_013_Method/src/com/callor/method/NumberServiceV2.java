package com.callor.method;

import java.util.Random;
import java.util.Scanner;

public class NumberServiceV2 {

	Scanner scan;

	public NumberServiceV2() {
		scan = new Scanner(System.in);

	}

	public Integer inputNum() {
		while (true) {
			System.out.println("0 ~ 100까지 중 정수를 입력하세요");
			System.out.print("정수입력 (취소시 QUIT입력)>> ");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			if (strNum.trim().equals("QUIT")) {
				return null;
			}
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.out.println("숫자가 아닌 값을 입력하였음");
				System.out.println("정수를 입력하세요");
				continue;
			}

			if (intNum < 0 || intNum > 100) {
				intNum = Integer.valueOf(strNum);
				System.out.println("범위 내의 정수만 입력하세요");
				System.out.println("-".repeat(50));
				continue;
			}
			// return intNum; 
			// 완벽히 정수입력을 끝내면 더이상의 입력을 중지하는 곳
		}

	}

}
