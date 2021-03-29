package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	int[] intMembers;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intSum;
	float floatAvg;
	Scanner scan;
	
	public ScoreServiceV1 () {
		
		intMembers = new int[5];
		intKor = new int[intMembers.length];
		intEng = new int[intMembers.length];
		intMath = new int[intMembers.length];
		intSum = new int[intMembers.length];
		floatAvg = 0.0f;
		scan = new Scanner(System.in);
		
	}
	
	public void makeScore() {
			
		for(int i = 0 ; i < intMembers.length ; i++) {
			int num = i+1;

			System.out.println("========================");
			System.out.println(num + "번의 점수입력을 진행합니다");
			System.out.printf("%d번의 국어점수를 입력하세요.\n", num);
			System.out.print("입력 >> ");
			intKor[i] = scan.nextInt();
			while(true) {
				if( intKor[i] > 100) {
					System.out.println("점수입력범위를 초과했습니다.");
					System.out.println("다시 입력 하세요");
					intKor[i] = scan.nextInt();
				}
			}
			System.out.printf("%d번의 영어점수를 입력하세요.\n", num);
			System.out.print("입력 >> ");
			intEng[i] = scan.nextInt();
			while(true) {
				if( intKor[i] > 100) {
					System.out.println("점수입력범위를 초과했습니다.");
					System.out.println("다시 입력 하세요");
					intKor[i] = scan.nextInt();
					}
			}
			System.out.printf("%d번의 수학점수를 입력하세요.\n", num);
			System.out.print("입력 >> ");
			intMath[i] = scan.nextInt();
			while(true) {
				if( intKor[i] > 100) {
					System.out.println("점수입력범위를 초과했습니다.");
					System.out.println("다시 입력 하세요");
					intKor[i] = scan.nextInt();
				}
				
		
			}
		
		}
				
	}
	
	public void TotalScore() {
		int i = 0;
		for(i = 0 ; i < intMembers.length ; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		System.out.println("=========================");
		System.out.println("학생별 성적표를 출력합니다.");
		for(int j = 0 ; j <intMembers.length ; j++) {
			floatAvg = intSum[j] / 3.0f;
			System.out.printf("%d번 학생\t국어 : %d점\t영어 : %d점\t수학 : %d점\t총점 : %d점\t평균 : %1.2f점\n",
					j+1, intKor[j], intEng[j], intMath[j], intSum[j], floatAvg);
		}
		
		
	}
	
}
