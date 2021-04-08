package com.callor.app;

import com.callor.app.service.InputServiceV1;

public class Test01 {
	
	public static void main(String[] args) {
		
		InputServiceV1 isV1 = new InputServiceV1();
		
		isV1.inputValue("라면",0,1000);
		
	}

}
