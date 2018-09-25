package com.valentinus.silalahi.latihan.abstraksi;

/*
 * https://github.com/thjanssen/Stackify-OopAbstraction
*/

import java.util.HashMap;
import java.util.Map;

public class CoffeeDemo {
	public static void main(String[] xxx) {
		Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
		beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean("My favorite filter coffee bean!", 10));
		beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean("My favorite Espresso bean!", 10));

//		CoffeeMachine machine = new CoffeeMachine(beans);

//		Coffee espresso = machine.brewCoffee(CoffeeSelection.ESPRESSO);

	}
}
