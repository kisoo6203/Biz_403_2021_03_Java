package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	Scanner scan = new Scanner(System.in);
    int[] intnum;
    int[] intKor;
    int[] intEng;
    int[] intMath;
    int[] intSum;
    float floatAvg;
    
    
    public ScoreServiceV1() {
    	
    	intnum = new int[5];
    	intKor = new int[intnum.length];
    	intEng = new int[intnum.length];
    	intMath = new int[intnum.length];
    	intSum = new int[intnum.length];
    	floatAvg = 0.0f;
    	    	
    }
    public void makeScore() {
    	
    	for(int i = 0; i < intnum.length ; i++) {
    		int num1 = i+1;
    		
    		System.out.println("==========================");
    		System.out.println(num1 + "번의 점수");
    		System.out.printf("%d번의 국어점수를 입력해주세요\n",num1);
    		System.out.print(" >> ");
    		intKor[i] = scan.nextInt();
    		System.out.println(num1 + "번의 점수");
    		System.out.printf("%d번의 영어점수를 입력해주세요\n",num1);
    		System.out.print(" >> ");
    		intEng[i] = scan.nextInt();
    		System.out.println(num1 + "번의 점수");
    		System.out.printf("%d번의 수학점수를 입력해주세요\n",num1);
    		System.out.print(" >> ");
    		intMath[i] = scan.nextInt();
    		
    	}
    	
    }
    public void TotalScore() {
    	
    	int j = 0;
    	for(j = 0 ; j < intnum.length; j++) {
    		intSum[j] = intKor[j];
    		intSum[j] += intEng[j];
    		intSum[j] += intMath[j];
    	}
    	System.out.println("---------------------------");
    	for(int i = 0 ; i < intnum.length ; i++) {
    		floatAvg = intSum[i] / 3.0f;
    		System.out.printf("%d번\t국어 : %d점\t영어 : %d점\t수학 : %d점\t총점 : 점\t평균 : %d점\n",
    				i+1, intKor[i], intEng[i], intMath[i], intSum[i], floatAvg);
    	}
    	
    }
   
	
}