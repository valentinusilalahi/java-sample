package com.silalahi.valentinus.advanced.parkiran;

public class Level {
	private int floor;
	private AreaParkir[] areaParkir;
	private int parkirKosong = 0;
	private static final int PARKIR_KOSONG_PER_BARIS = 10;

	public Level(int flr, int noParkir) {

	}

	public int parkirKosong() {
		return parkirKosong;
	}

	/* Find a place to park this vehicle. Return false if failed. */
	public boolean parkVehicle(Kendaraan kendaraan) {
		return false;
	}

	/*
	 * Park a vehicle starting at the spot spotNumber, and continuing until
	 * vehicle.spotsNeeded.
	 */
	private boolean parkStartingAtSpot(int num, Kendaraan k) {
		return false;
	}

	/*
	 * Find a spot to park this vehicle. Return index of spot, or -1 on failure.
	 */
	private int findAvailableSpots(Kendaraan kendaraan) {
		return floor;
	}

	/*
	 * When a car was removed from the spot, increment availableSpots
	 */
	public void spotFreed() {
		parkirKosong++;
	}
}
