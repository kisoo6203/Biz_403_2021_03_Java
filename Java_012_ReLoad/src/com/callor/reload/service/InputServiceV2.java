package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	protected Scanner scan;
	protected List<Integer> intList;
	
	public InputServiceV2() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
		
	}
	public void intputNum() {
		int intNum = 0;
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println("정수를 입력하세요 !(50 ~ 150)!");
			System.out.print("정수 >> ");
			
			intNum = scan.nextInt();
			
			if(intNum < 50 || intNum > 150) {
				System.out.println("-".repeat(50));
				System.out.println("(50 ~ 150) 범위의 정수만 입력하세요!!");
				System.out.printf("입력한 정수 : %d\n", intNum);
				intList.add(intNum);
				
			} else {
				break;
			}
			
		
		}
		
	}
		
	
}
