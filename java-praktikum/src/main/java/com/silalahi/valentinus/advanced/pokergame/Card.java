package com.silalahi.valentinus.advanced.pokergame;

public abstract class Card {
	private boolean available = true;

	/*
	 * number or face that's on card - a number 2 through 10, or 11 for Jack, 12
	 * Queen, 13 for King, or 1 for Ace
	 */

	protected int faceValue;
	protected Suit suit;

	public Card(int c, Suit s) {
		faceValue = c;
		suit = s;
	}

	public abstract int value();

	public Suit suit() {
		return suit;
	}

	/*
	 * Checks if the card is available to be given out to someone
	 */

	public boolean isAvailableQ() {
		return available;
	}

	public void markUnavailable() {
		available = false;
	}

	public void available() {
		available = true;
	}
}
