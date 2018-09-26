package com.valentinus.silalahi.latihan.factorypattern;

public class TehTawar implements Minuman {
	
	private String namaMinuman = TehTawar.class.getSimpleName();

	@Override
	public void rasa() {
		System.out.println(namaMinuman+"Rasa Hambar, menemani makanan berat");
	}

}
