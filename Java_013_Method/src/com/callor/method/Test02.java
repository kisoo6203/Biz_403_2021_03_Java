package com.callor.method;

import com.callor.method.service.NumberServiceV5;

public class Test02 {

	public static void main(String[] args) {
		
		NumberServiceV5 nsV5 = new NumberServiceV5();
		
		System.out.println(nsV5.inputNum("라면"));
		nsV5.inputNum("새우깡");
		
	}
	
}
