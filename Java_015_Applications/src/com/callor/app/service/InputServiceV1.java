package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {
	Scanner scan;
	
	public InputServiceV1() {
		scan = new Scanner(System.in);
	}
	public Integer inputValue(String title) {
		
		while(true) {
			System.out.println(title + "값을 입력하세요(중지:QUIT)");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			
			if(strInput.trim().equals("QUIT")) {
				return null;
			}
				try {
					Integer intInput = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					System.out.println("정수 또는 QUIT를 입력해주세요");
					continue;
				}
				return null;
		}
						
	}
		
	
	public Integer inputValue(String title, int start) {
		
		String retInput = String.format("%s값은(%d이상의~)",title, start);
		
		Integer intInput = this.inputValue(retInput);
		while(true) {
			if(intInput != null) {
				if(intInput < start) {
					System.out.printf("값은 %d 이상 입력하세요\n",start);
					
					continue;
				}
			}
			return intInput;
		}
		
	}
	public Integer inputValue(String title, int start, int end) {
		
		String retInput = String.format("%s 값은 (%d ~ %d)내의",title, start,end);
		
		Integer intInput = this.inputValue(retInput);
		while(true) {
			if(intInput != null) {
				if(intInput < start || intInput < end) {
					System.out.printf("값은 %d이상 %d이하로 입력해주세요\n",start,end);
					
					continue;
				}	
			}
			
			return null;
		
		}
				
	}

}
