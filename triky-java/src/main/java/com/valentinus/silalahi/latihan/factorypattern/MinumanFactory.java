package com.valentinus.silalahi.latihan.factorypattern;

public abstract class MinumanFactory {
	public static Minuman getMinuman(String jenisMinuman) {
		if (jenisMinuman.equals(JenisMinuman.TEH_HIJAU)) {
			return new TehHijau();
		} else if (jenisMinuman.equals(JenisMinuman.TEH_MANIS)) {
			return new TehManis();
		} else if (jenisMinuman.equals(JenisMinuman.TEH_TAWAR)) {
			return new TehTawar();
		}
		return null;
	}
}
