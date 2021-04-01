package com.callor.reload.service;

public class PrimeServiceV5 extends PrimeServiceV4 {

	@Override
	public void primeNum() {
		for(int i = 0 ; i < 50 ; i++) {
			
			int rndNum = rnd.nextInt(51)+50;
			int index = 0;
			for(index = 2; index < rndNum ; index++) {
				if(rndNum % index == 0) {
					break; // rndNum을 index로 나눴을때 0이나오면 멈춰라
				}
						
			}
			// index < rndNum 와 반대, index >= rndNum
			//			index == rndNum
			//			index == rndNum
			if(index >= rndNum) {
					intList.add(rndNum);
			}
		}
	}
	
	

	
	
}
