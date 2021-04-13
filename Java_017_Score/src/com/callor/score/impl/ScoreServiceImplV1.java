package com.callor.score.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.kisoo.standard.InputService;
import com.kisoo.standard.MenuService;
import com.kisoo.standard.impl.InputServiceImplV1;
import com.kisoo.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	Scanner scan;
	InputService inService;
	public ScoreServiceImplV1() {
		inService = new InputServiceImplV1();
	}
	
	@Override
	public void selectMenu() {
		scan = new Scanner(System.in);
		
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("학생정보 등록");
		scoreMenu.add("성적 등록");
		scoreMenu.add("성적정보 열기");
		scoreMenu.add("성적정보 저장");
		scoreMenu.add("성적정보 출력");
		
		menuService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템", scoreMenu);
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무 종료");
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

}
