package com.callor.app;

import com.kisoo.standard.InputService;
import com.kisoo.standard.impl.InputServiceImplV1;

public class InputEx_01 {
	
	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue("새우깡");
	}

}
