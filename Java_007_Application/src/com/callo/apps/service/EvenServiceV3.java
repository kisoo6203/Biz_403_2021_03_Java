package com.callo.apps.service;

/*
 *  자바프로그래밍에서 상속
 *  V3 클래스에서는 V2 클래스를 상속했다
 *  
 *  V2에 작성한(선언한) 변수, method 코드를
 *  		그대로 이어받아서 사용하겠다
 *  V2에 작성된 method들의 코드를 그대로 사용하면서
 *  		일부 method의 코드를 변경, 확장, 기능개선을
 *  		하여 내 프로젝트에 적용하겠다
 *  
 */
import java.util.Random;


public class EvenServiceV3 extends EvenServiceV2 {
	
	int[] intNum1 = new int[100]; 
	int[] intNums; 
	
	public EvenServiceV3() {
		intNums = new int[100]; 
	}
	public void makeNums() {
		
		Random rnd = new Random();
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
	}
	public void printEven() {
		System.out.println("================================");
		int nCount = 0;
		for(int i = 0 ; i < intNums.length ; i ++) {
			if(intNums[i] % 2 == 0) {
				System.out.printf("%5d", intNums[i]);
				nCount++;
				if(nCount % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
	public void sumEven() {
		int intSum = 0;
		for(int i = 0 ; i < intNums.length ; i++) {
			if(intNums[i] % 2 == 0) {
				intSum += intNums[i];
			}
		}
		System.out.println("===============================");
		System.out.println("총합 : " + intSum);
		System.out.println("===============================");
	}
}
