package com.valentinus.silalahi.latihan.string;

import java.util.Scanner;

public class KarakterStringDemo {
	public static void main(String[] args) {
		String kalimat;
		int panjangKalimat, jumlahHuruf = 1;
		// inisialisasi utk input data
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Kalimat : ");
		// menginputkan kalimat/string
		kalimat = input.nextLine();
		// huruf-huruf pada string dimasukan ke variabel array arrhuruf
		char[] arrHuruf = kalimat.toCharArray();
		// menghitung panjang/banyaknya huruf pada 1 kalimat yg diinputkan
		panjangKalimat = arrHuruf.length;
		/*
		 * pengulangan : satu persatu huruf dibandingkan dengan semua huruf yang lain
		 * jika terdapat huruf yg sama, maka jumlah huruf tsb bertambah 1
		 * (jumlahHuruf++)
		 */
		for (int i = 0; i < panjangKalimat; i++) {
			for (int j = 0; j < panjangKalimat; j++) {
				if (arrHuruf[i] != ' ') { // karakter spasi ' ' pada kalimat tidak dihitung jumlahnya
					if (i != j && (arrHuruf[i] == arrHuruf[j])) { // jika terdapat huruf yang sama, kecuali saat
																	// membandingkan huruf yg letaknya sama(i!=j),maka:
						jumlahHuruf++; // jumlah huruf bertambah
						arrHuruf[j] = ' '; // huruf yg sama tsb diubah menjadi karakter spasi agar tidak dihitung lagi
											// saat pengulangan berikutnya
					}
					if (j == panjangKalimat - 1) { // jika suatu huruf sudah selesai dibandingkan dgn huruf yg lain maka
													// :
						System.out.println("Jumlah huruf '" + arrHuruf[i] + "' = " + jumlahHuruf); // cetak huruf dan
																									// jumlahnya
						jumlahHuruf = 1; // jumlah huruf direset menjadi 1 utk menghitung huruf yg lain
					}
				}
			}
		}
		// end
	}
}
