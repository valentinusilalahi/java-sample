package com.valentinus.silalahi.latihan.abstraksi;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {
	private Map<CoffeeSelection, CoffeeBean> beans;
	private Map<CoffeeSelection, CoffeeBean> configMap;

	/*private Grinder grinder;
	private BrewingUnit brewingUnit;

	public CoffeeMachine(Map<CoffeeSelection, CoffeeBean> beans) {
		this.beans = beans;
		this.grinder = grinder();
		this.brewingUnit = brewingUnit();
		
		this.configMap = new HashMap<CoffeeSelection, Configuration>();
		this.configMap.put(CoffeeSelection.ESPRESSO, new Configuration(8, 28));
		this.configMap.put(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480));
	}

	public Coffee brewCoffee(CoffeeSelection selection) throws CoffeeSelection {
		Coffee coffee = new Coffee();
		System.out.println("Making coffee...");
		return coffee;
	}*/
}
