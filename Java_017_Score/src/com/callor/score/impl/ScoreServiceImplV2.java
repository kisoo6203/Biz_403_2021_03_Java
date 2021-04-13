package com.callor.score.impl;

import java.util.Scanner;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	String[] subjectList;
	Integer[] subScoreList;
	Scanner scan;
	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
		subjectList = new String[] {"국어","영어","수학"};
		subScoreList = new Integer[subjectList.length];
	}
	@Override
	public void inputScore() {
		
		Integer intNum = inService.inputValue("학번",1);
		if(intNum == null) {
			return;
		}
		String strNum = String.format("%03d",intNum);
				
		String strName = null;
		while(true) {
			System.out.println(strNum + "번 학생 이름 입력(중지:QUIT)");
			strName = scan.nextLine();
			if(strName.trim().equals("QUIT")) {
				return;
			} else if(strName.equals("")) {
				System.out.println("- 이름을 입력하세요 -");
				continue;
			}
			break;
		}
		for(int i = 0 ; i < subjectList.length ; i++) {
			subScoreList[i] = inService.inputValue(subjectList[i], 0, 100);
			if(subScoreList[i] == null) {
				return;
			}
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(subScoreList[0]);
		scoreVO.setEng(subScoreList[1]);
		scoreVO.setMath(subScoreList[2]);
		
		scoreList.add(scoreVO);
				
	}
	
	

}
