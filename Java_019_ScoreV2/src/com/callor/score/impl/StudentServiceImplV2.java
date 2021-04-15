package com.callor.score.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.kisoo.standard.InputService;

/*
 * 1. ScoreService 인터페이스를 implements하여 클래스 작성
 * 2. insertScore() method에서
 * 	학번, 국어, 영어, 수학점수를 입력받아
 * 	List<ScoreVO> scoreList에 추가
 * 3. 학번은 00001 형식으로 5자리로 변환하여 추가
 * 4. 한번 입력된 학번의 점수는 다시 입력할 수 없음
 * 5. printScore() 등 코드는 임의로 작성
 */
public class StudentServiceImplV2 implements ScoreService {

	Scanner scan;
	List<ScoreVO> scoreList;
	String[] subjectList;
	Integer[] subScoreList;
	InputService inService;
//	Integer intNum;
//	Integer intKor;
//	Integer intEng;
//	Integer intMath;
	
	public StudentServiceImplV2() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		subjectList = new String[] {"국어","영어","수학"};
		subScoreList = new Integer[subjectList.length];
		
	}
	@Override
	public void insertScore() {
		
		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = String.format("%05d", intNum);
		
		
		
//		System.out.println("학번을 입력하세요");
//		System.out.print(">> ");
//		intNum = scan.nextInt();
//		if(intNum.equals(intEng))
//		
//		System.out.println("국어 점수를 입력하세요");
//		System.out.print(">> ");
//		intKor = scan.nextInt();
//		System.out.println("영어 점수를 입력하세요");
//		System.out.print(">> ");
//		intEng = scan.nextInt();
//		System.out.println("수학 점수를 입력하세요");
//		System.out.print(">> ");
//		intMath = scan.nextInt();
//		
//		ScoreVO vo = new ScoreVO();
//		vo.setNum(intNum);
//		vo.setKor(intKor);
//		vo.setEng(intEng);
//		vo.setMath(intMath);
		
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
	}
	


}
