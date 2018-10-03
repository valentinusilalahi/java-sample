package com.silalahi.valentinus.advanced.collection;

import java.util.Collection;

/*
 * The Queue Interface
*/

public interface Queue<E> extends Collection<E> {
	E element();
	boolean offer(E e);
	E peek();
	E poll();
	E remove();
}
