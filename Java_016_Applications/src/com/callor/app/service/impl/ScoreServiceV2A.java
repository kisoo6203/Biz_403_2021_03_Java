package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.kisoo.standard.MenuService;
import com.kisoo.standard.impl.MenuServiceImplV1;

public class ScoreServiceV2A implements ScoreService{

	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected ScoreService scService;
	
	Scanner scan;
	String stuName;
	String[] subject;
			
	@Override
	public void selectMenu() {
		scan = new Scanner(System.in);
		subject = new String[] {"국어","영어","수학"};
		
		
		/*
		 *  보통 멤버변수(클래스영역에 선안된 변수들) 객체는
		 *  이 클래스의 생성자에서 만드는 것이 좋다
		 *  
		 *  하지만 
		 *  객체를 생성할 때 전달해야 할 매개변수(파라메터)에 대하여
		 *  수행해야할 연산코드가 있을 경우는
		 *  객체를 사용하기 전에 객체를 생성하는 코드를
		 *  작성하여도 된다.
		 */
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");
		
		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무 종료!!!");
				break;
			}
			if(menu == 1) {
				this.inputScore();
			} else if(menu == 2) {
				this.printScore();
			} else if(menu == 3) {
				this.saveScore();
			}
		}
		
	}

	@Override
	public void inputNum() {
		
		
	}




	@Override
	public void inputName() {
		// TODO Auto-generated method stub
		
	}


	

	

	@Override
	public void inputScore() {
		
		// 학번입력, 이름입력, 과목별 성적 입력
		// ScoreVO 객체에 담고, list에 추가
		// = ScoreVO 클래스를 사용하여 생성한 scoreVO 객체에 담고
		// = scoreVo 에 담고
		
		
		
	}
	

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		System.out.println("성적리스트 저장");
		System.out.println("저장할 파일이름을 입력하세요");
		System.out.print(">> ");
		String strFileName = scan.nextLine();
		if (strFileName.equals("")) {
			System.out.println("파일이름을 입력해야 합니다");
			return;
		}
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
