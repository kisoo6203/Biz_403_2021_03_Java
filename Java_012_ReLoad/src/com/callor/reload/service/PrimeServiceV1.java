package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	Random rnd;
	int intNum;

	public void primeNum() {

		rnd = new Random();

		intNum = rnd.nextInt(51) + 50;

	}

	public void printPrime() {
		int i = 0;
		for (i = 2; i < intNum; i++) {

			if (intNum % i == 0) {
				System.out.printf("%d 는 소수가 아님\n", intNum);
				break;
			}

		}
		
		if(intNum == i) {
			System.out.printf("%d 는 소수\n", intNum);
		}

	}

}
