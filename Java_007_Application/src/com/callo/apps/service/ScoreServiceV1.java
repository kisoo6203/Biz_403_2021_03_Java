package com.callo.apps.service;

import java.util.Random;

public class ScoreServiceV1 {

	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intSum;
	int[] floatAvg;

	public ScoreServiceV1() {
		intKor = new int[10];
		intEng = new int[10];
		intMath = new int[10];
		
	}

	public void makeNum() {
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t석차");
		Random rnd = new Random();
		int intnum = 0;
		for (int i = 1; i < 10; i++) {
			intnum = i + 1;
			// System.out.println(i);

		}
	}

	public void makeSum() {
		Random rnd = new Random();
		
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
			intSum = intKor[i] + intEng[i] + intMath[i];
			System.out.printf("\n%d\t%d\t%d\t%d", i, intKor[i], intEng[i], intMath[i]);
		}

	}
	public void printScore() {
		
	}

}
