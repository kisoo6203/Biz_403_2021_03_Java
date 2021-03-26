package com.callor.apps.service;

import java.util.Random;

public class TimeServiceV1 {

	int[] intNums = new int[8];
	int intnum = 1;
	public TimeServiceV1() {
	
		
	}
	
	public void makeNums() {
		intnum++;
		System.out.printf("%d단\n", intnum);
		
		for(int i = 0 ; i < 8 ; i++) {
			intNums[i] = (i + 2);
			System.out.printf("%d x %d = %d\n",intnum, intNums[i], intnum * intNums[i]);
			
		}
		
	}
	
}
