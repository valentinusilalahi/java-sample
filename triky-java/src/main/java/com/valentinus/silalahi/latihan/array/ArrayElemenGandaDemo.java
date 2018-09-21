package com.valentinus.silalahi.latihan.array;

public class ArrayElemenGandaDemo {

	public static void main(String args[]) {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };

		ElemenGanda.findDuplicateUsingForceMethod(names);
		ElemenGanda.findDuplicateUsingHashset(names);
		ElemenGanda.findDuplicateHashTable(names);

	}
}
