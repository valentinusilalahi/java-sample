package com.valentinus.silalahi.latihan.factorypattern;

public class TehManis implements Minuman {

	private String namaMinuman = TehManis.class.getSimpleName();

	@Override
	public void rasa() {
		System.out.println(namaMinuman + "Rasa Manis cocok, segara");
	}

}
