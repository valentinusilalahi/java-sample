package com.silalahi.valentinus.advanced.parkiran;

public class AreaParkir {
	private Kendaraan kendaraan;
	private UkuranKendaraan ukuranKendaraan;
	private int baris;
	private int noParkiran;
	private Level level;

	public AreaParkir(Level l, int r, int n, UkuranKendaraan uk) {

	}

	public boolean isAvailable() {
		return kendaraan == null;
	}

	/* Check if the spot is big enough and is available */
	public boolean canFitVehicle(Kendaraan kendaraan) {
		return false;
	}

	/* Park vehicle in this spot. */
	public boolean park(Kendaraan k) {
		return false;
	}

	public int getBaris() {
		return baris;
	}

	public int getNoParkiran() {
		return noParkiran;
	}

	/*
	 * Remove vehicle from spot, and notify level that a new spot is available
	 */
	public void removeVehicle() {

	}

}
