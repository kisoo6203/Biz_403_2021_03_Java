package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4A {

	protected Random rnd;
	protected List<Integer> intList;
	
	public PrimeServiceV4A() {
		rnd = new Random();
		intList = new ArrayList<Integer>();
		
		
	}
	public void primeNum() {
		for(int i = 0 ; i < 50 ; i++) {
			int rndNum = rnd.nextInt(51)+50;
			
			boolean notPrime = false;
			for(int index = 2; index < rndNum ; index ++) {
				if(rndNum % index == 0) {
					notPrime = true;
					break;
				}
			}
			// if( notPrime == true ) {
			// if(notPrime == false) {
				if( !notPrime ) { // notPrime이 true가 아니면
					
				
				//notPrime == false
					intList.add(rndNum);
			}
		}
		
	}// end primeNum()
	public void printPrime() {
		// 배열, List 구조의 데이터들을
		// 전체를 반복하여 (읽기)처리할 경우
		
		// 위의 2줄의 명령문을 한번에 실행하는 효과
		// for(int i = 0 ; i < intList.size(); i++) {
		//	Integer prime = intList.get(i);
		//}
		for(Integer prime : intList) {
			System.out.println(prime);
		}
	}
	
}
