package com.callor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_02 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateForm
			= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeForm
			= new SimpleDateFormat("hh:mm:ss");
		
		String curDate = dateForm.format(date);
		String curTime = timeForm.format(date);
		
		System.out.printf("오늘날짜 : %s\n현재시각 : %s",
				curDate,curTime); // 컴퓨터의 날짜와 시간을 가져오는건 문제없지만
									// 날짜와 시간으로 연산을 하는건 안됨
				
				
		
	}
	
}
