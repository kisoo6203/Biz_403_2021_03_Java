package com.callo.apps;

import com.callo.apps.service.EvenServiceV3A;

public class App_07 {

	public static void main(String[] args) {
		
		EvenServiceV3A esV3A = new EvenServiceV3A();
		
		esV3A.makeNums();
		esV3A.printEven();
		esV3A.sumEven();
	}
}
