package com.silalahi.valentinus.advanced.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/*
 * example The List Interface
*/

public class Shuffle {

	public static void shuffle(List<?> list, Random rnd) {
		for (int i = list.size(); i > 1; i--)
			swap(list, i - 1, rnd.nextInt(i));
	}

	public static <E> void swap(List<E> a, int i, int j) {
		E tmp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, tmp);
	}

	public static <E> void replace(List<E> list, E val, E newVal) {
		for (ListIterator<E> li = list.listIterator(); li.hasNext();)
			if (val == null ? li.next() == null : val.equals(li.next()))
				li.set(newVal);
	}

	public static <E> void replace(List<E> list, E val, List<? extends E> newVals) {
		for (ListIterator<E> it = list.listIterator(); it.hasNext();) {
			if (val == null ? it.next() == null : val.equals(it.next())) {
				it.remove();
				for (E e : newVals)
					it.add(e);
			}
		}
	}

	/*
	 * Here's a polymorphic algorithm whose implementation uses subList to deal a
	 * hand from a deck. That is, it returns a new List (the "hand") containing the
	 * specified number of elements taken from the end of the specified List (the
	 * "deck"). The elements returned in the hand are removed from the deck.
	 */
	public static <E> List<E> dealHand(List<E> deck, int n) {
		int deckSize = deck.size();
		List<E> handView = deck.subList(deckSize - n, deckSize);
		List<E> hand = new ArrayList<E>(handView);
		handView.clear();
		return hand;
	}

	public static void main(String[] xxx) {
		List<String> list = new ArrayList<String>();
		for (String a : xxx)
			list.add(a);
		Collections.shuffle(list, new Random());
		System.out.println(list);

		List<String> list1 = Arrays.asList(xxx);
		Collections.shuffle(list1);
		System.out.println(list1);
	}
}
