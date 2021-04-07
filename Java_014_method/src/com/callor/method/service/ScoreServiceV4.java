package com.callor.method.service;

public class ScoreServiceV4 {
	/*
	 *  과목의 이름이 저장될 배열을 클래스영역에 선언
	 *  과목점수입력, 성적리스트 출력 등에서 사용하기 때문에
	 *  멤버변수영역, 클래스영역에 선언
	 */
	// String[] strsub;
	protected String[] strSub;
	protected InputServiceV2 inService;
	/*
	 * 생성자 method
	 * ScoreServiceV4 클래스를 사용하여
	 * 객체를 생성할 때 호출할 method
	 */
	public ScoreServiceV4() {
		// 생성한다
		// 변수에 값을 저장, 객체를 초기화( new 생성자() 호출 )
		// 생성자에 작성되는 코드
		// 멤버변수 영역에 선언된 변수, 객체를 생성하는 코드
		inService = new InputServiceV2();
		strSub = new String[]{"국어", "영어", "수학"};
	}
	
	// 키보드를 사용하여 3과목의 점수를 입력받는데
	// InputServiceV2에 선언된 method를 사용할 예정이므로
	// 여기에서는 키보드 등의 클래스, 객체를 사용할 필요가 없다
	public void inputScore() {
		/*
		 * 과목명을 배열로 선언한 이유는
		 * 점수를 입력받는 method 호출 코드를 한번만 작성하고
		 * for() 반복문을 사용하여 처리할 수 있다
		 */
//		int intSum = 0;
//		float floatAvg = 3.0f;
		
		// 과목의 점수를 저장할 score배열을 생성
		int [] scores = new int[ strSub.length];
		for(int i = 0 ; i < strSub.length ; i++) {
			Integer score = inService.inputValue(strSub[i],0,100);
			if(score == null) {
				System.out.println("종료");
				/*
				 * break 와 return
				 * break를 실행하면 for() 반복문만 중단하고
				 * for() 반복문 이후의 코드를 실행한다
				 * for() 반복문 이후에 다른 연산(코드)를
				 * 		수행할 필요가 있을때는 break;
				 * return을 실행하면 현재 method(inputScore())를
				 * 		무조건 종료해 버린다.
				 * 		종료 : inpustScore() method를 호출했던 코드로
				 * 		되돌아간다
				 */
				// break;;
				return;
			}
			// return 받은 점수를 scores 배열의 i번쨰 위치에
			// 저장하라
			scores[i] = score;
//		
//		for(int i = 0 ; i < strSub.length ; i++) {
//			Integer intKor = inService.inputValue(strSub[i],0,100);
//			if(intKor == null) {
//				System.out.println("종료");
//				return;
//			}
//			Integer intEng = inService.inputValue(strSub[i],0,100);
//			if(intEng == null) {
//				System.out.println("종료");
//				return;
//			}
//			Integer intMath = inService.inputValue(strSub[i],0,100);
//			if(intMath == null) {
//				System.out.println("종료");
//				return;
//			}
//			intSum = intKor + intEng + intMath;
//			floatAvg = intSum / 3.0f;
//			
//			System.out.printf("%s 점수 : %d\n",strSub[i],intKor);
//			System.out.printf("%s 점수 : %d\n",strSub[i],intEng);
//			System.out.printf("%s 점수 : %d\n",strSub[i],intMath);
//			System.out.printf("총점 : %d\n",intSum);
//			System.out.printf("평균 : %2.2f\n",floatAvg);
		} // for end
		
		// scores 배열에 담긴 점수를 총점계산
		int sum = 0 ;
		for(int i = 0 ; i < scores.length ; i++) {
			sum += scores[i];
		}
		// 과목의 개수 만큼 값으로 평균을 계산한다
		float avg = (float)sum / strSub.length;
		// float avg = sum / strSub.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
