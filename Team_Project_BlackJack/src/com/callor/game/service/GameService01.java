package com.callor.game.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.game.model.GameVO;

public class GameService01 implements GameInterface01 {
	String[] pattern;
	Scanner scan;
	int card;
	List<GameVO> cardList;

	public GameService01() {
		scan = new Scanner(System.in);
		pattern = new String[] { "Spade ♠", "Clover ♣", "Heart ♥", "Diamond ◇" };
		card = 13;
		cardList = new ArrayList<GameVO>();
	}

	@Override
	public void inputMenu() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(" 블랙잭 게임을 시작합니다 ");
			System.out.println("- welcome to hell -");
			System.out.println("Player님께서는 게임을 시작하시겠습니까?(Y/N)");
			System.out.print("입력(Y/N) : ");
			String strChoice = scan.nextLine();
			if (strChoice.trim().equals("N")) {
				System.out.println("수고하셨습니다 안전귀가하세요");
			} else if (strChoice.equals("")) {
				System.out.println("응답은 Y or N 으로 입력바랍니다");
				continue;
			} else if (strChoice.equals("Y")) {
				System.out.println(" 카드 배분을 시작합니다 ");
				this.makeCard();
			}
			return;
		}

	}

	@Override
	public void makeCard() {
		String player = null;
		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < card; j++) {
				GameVO vo = new GameVO();
				vo.setCard(card);
				vo.setPattern(pattern[i]);
				cardList.add(vo);

			}

		}

	}

	@Override
	public void shareCard() {

	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

}
