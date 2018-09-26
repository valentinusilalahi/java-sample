package com.valentinus.silalahi.latihan.factorypattern;

public class TehHijau implements Minuman {

	private String namaMinuman = TehHijau.class.getSimpleName();

	@Override
	public void rasa() {
		System.out.println(namaMinuman + "Rasa Pahit namun pas untuk obat");
	}

}
