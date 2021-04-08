package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	List<ScoreVO> scoreList;
	Scanner scan;
	String stuName;
	String[] subject;
	int num = 0;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
	}

	@Override
	public void selectMenu() {
		while (true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 학생별 이름입력 2. 성적리스트 확인 (QUIT:종료)");
			System.out.print(">> ");
			String strMenu = scan.nextLine();
			if (strMenu.trim().equals("QUIT")) {
				System.out.println("입력을 종료합니다");
				return;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				System.out.println("- 메뉴선택 및 QUIT를 입력하세요 -");
				continue;
			}
			if (intMenu == 1) {
				this.inputName();
			} else if (intMenu == 2) {
				this.printScore();
			}
		}

	}

	@Override
	public String inputName() {

		while(true) {
			System.out.println("=".repeat(70));
			System.out.println("학생별 이름을 입력합니다");
			System.out.println("메뉴로 돌아가기 : MENU");
			System.out.println("-".repeat(70));
			System.out.print(">> ");
			stuName = scan.nextLine();
			if(stuName.trim().equals("MENU")) {
				return null;
			}
			if (stuName == null) {
				return null;
			} else {
				this.inputScore();
			}
			
		}
	}

	@Override
	public void inputScore() {
		String stuName1 = null;
		Integer intName1; 
		while (true) {
			++num;

			Integer[] scores = new Integer[subject.length];
			ScoreVO scoreVO = new ScoreVO();
			for (int i = 0; i < subject.length; i++) {
				while(true) {
					System.out.printf("%d번 학생 %s님의 성적을 입력해주세요. (메뉴 : MENU)\n", num, stuName);
					System.out.printf("%s점수>> ", subject[i]);
					stuName1 = scan.nextLine();
					if(stuName1.trim().equals("MENU")) {
						return;
					} 
					
					try {
						intName1 = Integer.valueOf(stuName1);
						if(intName1 < 0 || intName1 > 100) {
							System.out.println("입력은 0 ~ 100까지만 입력해주세요");
							continue;
						}
					} catch (NumberFormatException e) {
						System.out.println("값은 정수 및 MENU만 입력해주세요");
						continue;
					}
					break;
				}
				scores[i] = intName1;
			}
			scoreVO.setNum(num);
			scoreVO.setName(stuName);
			scoreVO.setKor(scores[0]);
			scoreVO.setEng(scores[1]);
			scoreVO.setMath(scores[2]);
			if (num % 5 == 0) {
				break;
			}
			return;
		}

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

}
