package com.valentinus.silalahi.latihan.factorypattern;

public class DemoFactoryPattern {
	public static void main(String[] xxx) {
		Minuman order = MinumanFactory.getMinuman(JenisMinuman.TEH_HIJAU);
		order.rasa();
		order = MinumanFactory.getMinuman(JenisMinuman.TEH_TAWAR);
		order.rasa();
		order = MinumanFactory.getMinuman(JenisMinuman.TEH_MANIS);
		order.rasa();
	}
}
