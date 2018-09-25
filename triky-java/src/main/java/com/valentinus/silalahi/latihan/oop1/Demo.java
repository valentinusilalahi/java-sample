package com.valentinus.silalahi.latihan.oop1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ammount : ");
		float ammount = sc.nextFloat();
		System.out.print("Kode Promo : ");
		String kodePromo = sc.next();
		Discount discount = new Discount(ammount, kodePromo);

		System.out.println(discount.toString());
	}
}
