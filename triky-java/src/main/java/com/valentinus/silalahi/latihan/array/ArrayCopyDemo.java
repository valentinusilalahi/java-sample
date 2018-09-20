package com.valentinus.silalahi.latihan.array;

public class ArrayCopyDemo {
	public static void main(String[] xxx) {
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[7];
		char[] copyTo1 = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));
		System.out.println(new String(copyTo1));

	}
}
