package com.valentinus.silalahi.latihan.array;

public class ArrayDuaDimensi {
	public static void main(String[] xxx) {
		String[][] names = { { "Mr.", "Mrs.", "Ms." }, { "Valentinus", "Silalahi", "Sinabutar" } };

		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][2] + names[1][1]);

		System.out.println(names.length);
	}
}
