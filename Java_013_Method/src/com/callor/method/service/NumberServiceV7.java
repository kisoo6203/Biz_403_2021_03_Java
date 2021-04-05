package com.callor.method.service;

public class NumberServiceV7 {
	protected InputService inservice;
	public NumberServiceV7() {
		String[] strBookName = {"국어","영어","수학","과학","국사"};
		inservice = new InputService();
	}
	public Integer inputNum() {
		Integer korNum = null;
		while(true) {
			korNum = inservice.inputValue("국어점수 (0 ~ 100)");
			if(korNum == null) {
				return null;
			} else if(korNum < 0 || korNum > 100) {
				System.out.println("점수는 0 ~ 100점까지 입력하세요");
				continue;			
			} else {
				continue; // 과목별로 입력하는 방법은?
			}	
		}				// 국사까지 입력을 완료한 후에는 종료
		
	}
	
}
