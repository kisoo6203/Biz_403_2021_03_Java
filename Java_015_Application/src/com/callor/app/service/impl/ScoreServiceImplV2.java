package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO2;

// V1에는 ScoreService 인터페이스가 impl 되어 있기 때문에
// V1을 상속받으면 자동으로 인터페이스도 상속받게 된다
public class ScoreServiceImplV2 extends ScoreServiceImplV1A {

	public String inputNum() {
		Integer intNum1 = null;
		String intNum = "";
		while (true) {
			intNum1 = inService.inputValue("학번", 0, 100);
			intNum = String.format("2021%03d", intNum1);
			if (intNum1 == null) {
				return null;
			}

			int num1 = 0;
			
			for (int index = 0; index < scoreList.size(); index++) {
				ScoreVO2 vo = scoreList.get(index);
				String strNum = vo.getNum();
				intNum = String.format("2021%03d", intNum1);
				if (strNum == intNum) {
					num1 = 1;
					break;
				}

			}
			if (num1 == 1) {
				System.out.println("- 학번을 확인해 주세요 -");
				continue;
			}
			
			return intNum;
		}
	}

	private String inputName(String strNum) {
		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT:종료)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				break;
			} else if (strName.equals("")) { // 입력없이 Enter만
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}
			return strName;
		}

		return null;
	}

	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}

		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}
		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}

		// 입력을 모두 마쳤으면 VO에 담기
		ScoreVO2 scoreVO = new ScoreVO2();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		// VO에 담긴 데이터를 List 저장소에 추가
		scoreList.add(scoreVO);

		/*
		 * 아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난 후 한 과목이라도 QUIT하면 종료하는 코드이다 만약 국어 과목에서 QUIT를
		 * 하여도 영어, 수학 점수를 입력받은 Prompt가 나타나고 3과목을 모두 통과한 후 입력종료가 된다
		 */
//		if(intKor == null || intEng == null || intMath == null) {
//			return;
//		}

	}

}
