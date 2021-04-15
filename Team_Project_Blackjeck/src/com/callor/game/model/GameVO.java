package com.callor.game.model;

public class GameVO {
	
	String pattern;
	Integer card;
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern, int card) {
		this.pattern = pattern + card;
	}
	public Integer getCard() {
		return card;
	}
	public void setCard(Integer card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "GameVO [pattern=" + pattern + ", card=" + card + "]";
	}
	
	

}
