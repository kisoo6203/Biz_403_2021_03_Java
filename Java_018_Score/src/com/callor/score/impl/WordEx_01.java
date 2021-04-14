package com.callor.score.impl;

import com.callor.score.service.WordService;

public class WordEx_01 {
	
	public static void main(String[] args) {
		
		WordService wService = new WordServiceImplV1A();
//		wService.loadWord();
		wService.viewWord();
	}

}
