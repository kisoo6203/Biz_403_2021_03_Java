package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> intList;
	
	public void PrimeServiceV4() {
		rnd = new Random();
		intList = new ArrayList<Integer>();
		
		
	}
	public void primeNum() {
		int[] intrnd = new int[50];
		int i = 0;
						
		for(i = 2 ; i < 50 ; i++) {
			 intrnd[i] = rnd.nextInt(51)+50;
			if(intrnd[i] % i == 0) {
				
				System.out.printf("[%d] = %d\n", i , intrnd[i]);
				
				
			}
		}
		if( i < intrnd[i]) {
			System.out.println(intrnd[i] +"는 소수가아님");
		} else {
			System.out.println("소수 리스트");
			System.out.println(intrnd[i]);
		}
		
	}
	
}
