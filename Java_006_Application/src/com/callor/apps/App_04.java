package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[20];

		for (int i = 0; i < 20; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
			if (intNums[i] % 2 == 0) {

				System.out.printf("[%d]번째 짝수 : %d\n", i, intNums[i]);
				break;
			}
		}

	}
}
