package com.valentinus.silalahi.latihan.array;

public class DemoArray {
	public static void main(String[] xxx) {
		int[] anArray;
		anArray = new int[10];

		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;

		System.out.println("Element index 0 : " + anArray[0]);
		System.out.println("Element index 1 : " + anArray[1]);
		System.out.println("Element index 2 : " + anArray[2]);
		System.out.println("Element index 3 : " + anArray[3]);
		System.out.println("Element index 4 : " + anArray[4]);
		System.out.println("Element index 5 : " + anArray[5]);
		System.out.println("Element index 6 : " + anArray[6]);
		System.out.println("Element index 7 : " + anArray[7]);
		System.out.println("Element index 8 : " + anArray[8]);
		System.out.println("Element index 9 : " + anArray[9]);

		int[] array = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i++]);
		}

		array[2] = 2 * array[3] + array[5];
		System.out.println(array[2]);

	}

	public int computeSum(int[] num) {
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		return sum;
	}
}
