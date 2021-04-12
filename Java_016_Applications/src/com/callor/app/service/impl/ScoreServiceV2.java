package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceV2 implements ScoreService {

	Scanner scan;
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}
	@Override
	public void selectMenu() {
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println("빛나라 고교 성적처리 2021");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적저장");
			System.out.println("메뉴를 선택하세요 (중지:QUIT)");
			System.out.print("업무선택>> ");
			String strMenu = scan.nextLine();
			if(strMenu.trim().equals("QUIT")) {
				return;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				System.out.println("메뉴입력 오류 !! (확인 요망)");
				continue;
			}
			if(intMenu == 1) {
				System.out.println("- 성적입력창으로 이동합니다 -");
				this.inputScore();
			} else if(intMenu == 2) {
				this.printScore();
			} else if(intMenu == 3) {
				this.saveScore();
			}
			return;
			
		}
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
