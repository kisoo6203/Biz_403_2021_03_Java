package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intClass1 = rnd.nextInt(51)+9;
		int intClass2 = rnd.nextInt(51)+9;
		int intClass3 = rnd.nextInt(51)+9;
		int intClass4 = rnd.nextInt(51)+9;
		int intClass5 = rnd.nextInt(51)+9;
		
		int intTotal = 0;
		
		System.out.println("===================");
		System.out.println("인원수\t피자주문   전체");
		System.out.println("-----------------");
		int pizzaBox = intClass1 / 6;
		if(intClass1 % (pizzaBox * 6) > 0) {
			pizzaBox++;
			
		}
				
		intTotal += pizzaBox;
		System.out.printf("  "+ intClass1 + "\t");
		System.out.print(pizzaBox + "\t");
		System.out.println(pizzaBox * 6);
		
		System.out.println("-----------------");
		System.out.printf("전체 주문 BOX 수량: %d\n", intTotal);
		
		
	}
}
