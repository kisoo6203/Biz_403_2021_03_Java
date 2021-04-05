package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	Scanner scan = new Scanner(System.in);
	
	
	
	public Integer inputNum(String title){
		String strTitle = null;
		Integer intTitle = 0;	
		while(true) {
			System.out.printf("%s 값을 입력하세요\n", title);
			System.out.print(">> ");
			strTitle = scan.nextLine();
			
			if(strTitle.trim().equals("QUIT")) {
				return null;
			}
			try {
				intTitle = Integer.valueOf(strTitle);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("값은 정수만 입력");
				continue;
			}
			if(intTitle < 0 || intTitle > 100) {
				System.out.println("0 ~ 100까지만 입력");
				continue;
			}
			return intTitle;
	
		}
		
	}
	

}
