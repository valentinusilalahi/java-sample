package com.silalahi.valentinus.advanced.oop1;

public class ACMEBicycle implements Bicycle {

	int cadence = 0;
	int speed = 0;
	int gear = 0;

	@Override
	public void changeCadence(int newValue) {
		cadence = newValue;
	}

	@Override
	public void changeGear(int newValue) {
		gear = newValue;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;

	}

	void printStates() {
		System.out.println("cadence: " + cadence + " Speed : " + speed + " Gear : " + gear);
	}

}
