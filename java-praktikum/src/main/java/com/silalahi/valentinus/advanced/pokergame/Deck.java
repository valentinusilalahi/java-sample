package com.silalahi.valentinus.advanced.pokergame;

import java.util.ArrayList;

public class Deck<T extends Card> {

	// All cards, dealt or not
	private ArrayList<T> cards;
	// marks first undealt card
	private int dealtIndex = 0;

	public void shuffle() {

	}

	public int remainingCards() {
		return cards.size() - dealtIndex;
	}

	public T[] dealHand(int number) {
		return null;

	}

	public T dealCard() {
		return null;

	}
}
