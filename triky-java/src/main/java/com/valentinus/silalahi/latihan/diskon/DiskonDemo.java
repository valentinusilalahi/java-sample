package com.valentinus.silalahi.latihan.diskon;

import java.util.Scanner;

public class DiskonDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int hrg, jml, total = 0, total1, total2, total3;

		System.out.println("Masukkan Harga Barang : Rp. ");
		hrg = s.nextInt();
		System.out.println("Jumlah pembelian Barang : ");
		jml = s.nextInt();
		total = hrg * jml;
		System.out.println("Total bayar : Rp. " + total);
		total1 = (total - ((total * 5) / 100));
		total2 = (total - ((total * 10) / 100));
		total3 = (total - ((total * 15) / 100));

		if (total >= 200000) {
			System.out.println("Total Bayar(diskon 15%) : Rp.  " + total3);
		} else if (total >= 100000) {
			System.out.println("Total Bayar (Diskon 10%) : Rp " + total2);
		} else if (total >= 50000) {
			System.out.println("Total Bayar (Diskon 5%) : Rp " + total1);
		}

		if (jml >= 50 && total >= 200000) {
			System.out.println("Total Bayar (Diskon 5%) : Rp " + (total3 - ((total3 * 5) / 100)));
		} else if (jml >= 50 && total >= 100000) {
			System.out.println("Total Bayar : Rp " + (total2 - ((total2 * 5) / 100)));
		} else if (jml >= 50 && total >= 50000) {
			System.out.println("Total Bayar (Diskon 5%) : Rp " + (total1 - ((total1 * 5) / 100)));
		} else if (jml >= 50) {
			System.out.println("Total Bayar (Diskon 5%) : Rp " + (total - ((total * 5) / 100)));
		}
	}
}
