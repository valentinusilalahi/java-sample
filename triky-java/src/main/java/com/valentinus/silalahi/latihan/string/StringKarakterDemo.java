package com.valentinus.silalahi.latihan.string;

public class StringKarakterDemo {
	public static void main(String[] xxx) {
		String kalimat = "Saya Valentinus Silalahi, tinggal di Jakarta kelahiran 08-04-1990, "
				+ "lulusan Teknik Informatika Bandung!" + "!@#$%_)(*~";
		System.out.println("Kalimat asli : " + kalimat);
		getKarakterAngka(kalimat);
		System.out.println("\n");
		getKarakterHuruf(kalimat);
		System.out.println("\n");
		getSpesialKarakter(kalimat);
		System.out.println("\n");
		getSpasi(kalimat);
	}

	public static void getKarakterAngka(String kalimat) {
		String kalimatBaru = kalimat.replaceAll("[^0-9.]", "");
		System.out.println("Output Angka : " + kalimatBaru);
		String[] splitKal = kalimatBaru.split("");
		System.out.println("Total Angka : " + splitKal.length);
	}

	public static void getKarakterHuruf(String kalimat) {
		String kalimatBaru = kalimat.replaceAll("[^a-zA-Z]", "");
		System.out.println("Output Huruf : " + kalimatBaru);
		String[] splitKalimat = kalimatBaru.split("");
		System.out.println("Total huruf : " + splitKalimat.length);
	}

	public static void getSpesialKarakter(String kalimat) {
		String kalimatBaru = kalimat.replaceAll("[a-zA-Z0-9 ]*", "");
		System.out.println("Spesial Karakter : " + kalimatBaru);
		String[] split = kalimatBaru.split("");
		System.out.println("Total Spesial Karakter : " + split.length);
	}

	public static void getSpasi(String kalimat) {
		int counter = 0;
		String[] splitKal = kalimat.split("");
		for (int i = 0; i < splitKal.length; i++) {
			if (splitKal[i].contains(" ")) {
				counter++;
			}
		}
		System.out.println("Jumlah Spasi : " + counter);
	}
}
