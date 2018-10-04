package com.silalahi.valentinus.advanced.oop2;

import java.util.List;

public class Library {
	private final List<Book> books;

	public Library(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getTotalBooksInLibrary() {
		return books;
	}
}
