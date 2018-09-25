package com.valentinus.silalahi.latihan.abstraksi;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

public class TestCoffeeMachine {
	public void testEspresso() throws CoffeeException {
		Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
		beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean("My favorite espresso beans", 10));
		beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean("My favorite filter coffee beans", 10));

//		CoffeeMachine machine = new CoffeeMachine(beans);
//		Coffee espresso = machine.brewCoffee(CoffeeSelection.ESPRESSO);

//		Assert.assertEquals(CoffeeSelection.ESPRESSO, espresso.getSelection());
//		Assert.assertEquals(28d, espresso.getQuantity(), 0.01);
	}
}
