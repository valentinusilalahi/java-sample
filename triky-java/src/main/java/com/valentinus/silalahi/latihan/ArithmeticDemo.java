package com.valentinus.silalahi.latihan;

public class ArithmeticDemo {
	public static void main(String[] xxx) {
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		int originalResult = result;

		result = result - 1;
		System.out.println(originalResult + " - 1 = " + result);

		originalResult = result;
		result = result * 2;
		System.out.println(originalResult + " * 2 = " + result);
		originalResult = result;

		result = result / 2;
		System.out.println(originalResult + " / 2 = " + result);
		originalResult = result;

		result = result + 8;
		System.out.println(originalResult + " + 8 = " + result);
		originalResult = result;

		result = result % 7;
		System.out.println(originalResult + " % 7 = " + result);
	}
}
