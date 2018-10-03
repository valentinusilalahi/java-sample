package com.silalahi.valentinus.advanced.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Countdown {
	public static void main(String[] xxx) throws InterruptedException {
		int time = Integer.parseInt(xxx[0]);
		Queue<Integer> queue = (Queue<Integer>) new LinkedList<Integer>();

		for (int i = time; i >= 0; i--)
			queue.add(i);
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			Thread.sleep(1000);
		}
	}

	static <E> List<E> heapSort(Collection<E> c) {
		Queue<E> queue = (Queue<E>) new PriorityQueue<E>(c);
		List<E> result = new ArrayList<E>();

		while (!queue.isEmpty())
			result.add(queue.remove());

		return result;
	}
}
