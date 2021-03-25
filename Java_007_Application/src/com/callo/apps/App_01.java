package com.callo.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		int[] intNums = new int[20];
		Random rnd = new Random();
		

		System.out.println("소수 리스트");
		for (int i = 50; i < 100; i++) {
			
			for (int n = 2; n < i; n++) {
				if (i % 2 == 0) {
					
					break;
				}
				System.out.println(i);
			}

		}

		
		
	}

}
