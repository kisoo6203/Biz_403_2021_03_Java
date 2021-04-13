package com.callor.score.blackjack;

import java.util.Scanner;

public class BlackjackEx {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean uCardSetFull = false;
		boolean dCardSetFull = false;
		boolean gameWin = true;
		int comCardSet[] = new int[52];
		
		comCardSetInit(comCardSet);
	}

}
