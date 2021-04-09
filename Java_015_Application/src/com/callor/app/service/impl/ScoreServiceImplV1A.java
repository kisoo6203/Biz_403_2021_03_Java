package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO2;
import com.callor.app.service.ScoreService2;
import com.kisoo.standard.InputService;
import com.kisoo.standard.impl.InputServiceImplV1;

/*
 *  1. 메뉴를 보여주고
 *  2. 성적입력 : 학생수의 제한이 없다.
 *  	가. 학번
 *  	나. 학생이름 : inputName()
 *  	다. 과목별 성적 : inputScore()
 *  		or
 *  	가. 학생성적입력 : inputScore() 시작
 *  		- 학번입력
 *  		- 이름입력
 *  		- 점수입력
 *  
 *  	나. 학생의 이름을 입력하는 inputName() method는
 *  		return type이 String 형이기 때문에
 *  		학생이름을 입력받고 입력받은 학생이름을 return 한다
 *  		이 return된 학생이름을 inputScore()에서
 *  		변수에 담아 처리를 할 수 있다
 */
public class ScoreServiceImplV1A implements ScoreService2 {
	// 저장소
	protected List<ScoreVO2> scoreList;
	
	// 학번, 점수를 입력받을때 사용할 객체
	protected InputService inService;
	
	// 학생의 이름을 입력받을때 사용할 객체
	protected Scanner scan;
		
	public ScoreServiceImplV1A() {
		inService = new InputServiceImplV1();
		
		scoreList = new ArrayList<ScoreVO2>();
		scan = new Scanner(System.in);
	
	}

	@Override
	public void selectMenu() {
		while (true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 학번입력 2. 성적리스트 확인 (QUIT:종료)");
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
				this.inputScore();
			} else if(intMenu ==2) {
				this.printScore();
			}
		}

	}

	@Override
	public void inputName() {
		// TODO 학번으로 보여주고 이름을 입력받는 method
		
		this.inputName("무명");
		return;
		
	}
	private String inputName(String strNum) {
		while(true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT:종료)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				break;
			} else if(strName.equals("")) { // 입력없이 Enter만
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}
			return strName;
		}
		return null;
	}
	/*
	 *  현재 클래스 내부에서만 호출되는 method private으로 선언한다
	 *  현재 클래스를 상속받아 확장하여 사용할 수 있도록 하려면
	 *  private => protected로 변경 해주는것이 좋다
	 */
	protected String inputNum() {
		// 학번입력처리 : 001, 002 형식으로 입력받자
		// 정수 1 이상을 입력하면
		// 		정수 값이 intNum에 담길것이고
		// QUIT를 입력했으면 
		//		null값이 intNum에 담길것이다
		Integer intNum = inService.inputValue("학번",1);
		
		// intNum에 null 값이 담겨있으면 종료하고
		// 다시 메뉴로 돌아간다
		if(intNum == null) {
			return null;
		}
		
		// 정수를 입력했으면 입력받은 정수값을
		// 학번의 문자열 형식(001, 002)으로 변환을 하자
		// String.format("%3d", 1) :
		//		전체 자릿수를 3개로 만들고
		//		정수값을 오른쪽 정렬하는 문자열 만들기
		//		"  1"
		// String.format("%03d", 1)
		// 		전체 자릿수를 3개로 만들고
		//		정수값을 오른쪽 정렬하고
		//		왼쪽의 빈칸에 0을 채워라
		//		"001"
		String strNum = String.format("2021%03d", intNum); // 2021001
		
		return strNum;
	}

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		
		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if(strName == null) {
			return;
		}
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
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
		 *  아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난 후
		 *  한 과목이라도 QUIT하면 종료하는 코드이다
		 *  만약 국어 과목에서 QUIT를 하여도
		 *  영어, 수학 점수를 입력받은 Prompt가 나타나고 3과목을
		 *  모두 통과한 후 입력종료가 된다
		 */
//		if(intKor == null || intEng == null || intMath == null) {
//			return;
//		}
		

	}

	@Override
	public void printScore() {
		// TODO 리스트 출력하기
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		for(int index = 0 ; index < scoreList.size(); index++) {
			
			ScoreVO2 vo = scoreList.get(index);
			
			// System.out.println(scoreList.get(index).getNum());
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		
	}

}
