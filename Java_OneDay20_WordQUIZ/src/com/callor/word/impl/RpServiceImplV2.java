package com.callor.word.impl;

import java.util.Arrays;
import java.util.Random;

import com.callor.word.model.RpVO;

public class RpServiceImplV2 extends RpServiceImplV1 {

	@Override
	public void viewWord() {
		Random rnd = new Random();
		int nPoint = 3;
		while (true) {
			RpVO vo = this.getWord();
			String strEng = vo.getEng();
			String[] strWords = strEng.split("");
			
			for (int i = 0; i < 100; i++) {
				int index1 = rnd.nextInt(strWords.length);
				int index2 = rnd.nextInt(strWords.length);

				String temp;
				temp = strWords[index1];
				strWords[index1] = strWords[index2];
				strWords[index2] = temp;
				if(nPoint == 0) {
					System.out.println("도전횟수가 남아 있지 않습니다");
					System.out.println("게임을 종료합니다...");
					return;
				}
			}
			
			
			while (true) {
				
				System.out.println("-".repeat(50));
				System.out.println("다음 배열을 보고 영단어를 완성하세요");
				System.out.printf(" (남은기회 : %d회) (다음문제로 넘어가시려면 1을 입력하세요)\n", nPoint);
				System.out.println(Arrays.toString(strWords));
				System.out.println("=".repeat(50));
				System.out.print("입력>> ");
				String inputWords = scan.nextLine();
				if(inputWords.equals("QUIT")) {
					return;
				}
				if(inputWords.equals("1")) {
					System.out.println("다음 문제를 공개합니다");
//					System.out.println("-".repeat(50));
					nPoint--;
					break;
				}
				if (inputWords.equalsIgnoreCase(vo.getEng())) {
					System.out.println("정답입니다");
					nPoint++;
					System.out.printf("현재 포인트 : %d\n", nPoint);
					break;
				} else {
					System.out.println("오답입니다");
					nPoint--;
					System.out.printf("현재 포인트 : %d\n", nPoint);
					// this.testWord();
					System.out.println("- 힌트 -");
					System.out.println("영단어의 뜻 >> "  + vo.getKor());
				}
				if(nPoint == 0) {
					System.out.println("남은 도전 횟수가 남아 있지 않습니다");
					System.out.println("the end...");
					return;
					
				}
				
			}
		}

	}

	protected void testWord() {

//		System.out.println("재도전은 3번의 기회가 있습니다");
//		System.out.println("다음 단어로 넘어가기 : 1을 입력하세요");
//		String 

	}

}
