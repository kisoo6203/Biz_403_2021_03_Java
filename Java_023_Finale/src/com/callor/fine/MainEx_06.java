package com.callor.fine;

import java.util.ArrayList;
import java.util.List;

import com.callor.fine.model.ScoreVO;

public class MainEx_06 {
	
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = null;
		
		
		for(int i = 0 ; i < 10 ; i++) {
			scoreList = new ArrayList<ScoreVO>();
			ScoreVO scoreVO = null;
			scoreVO = new ScoreVO(); // 생성자 만들기
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
						
			scoreList.add(scoreVO);
			
			// 오류가 나는 이유 파악하기
			
		}
		
	}

}
