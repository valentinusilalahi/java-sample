package com.silalahi.valentinus.advanced.parkiran;

import java.util.ArrayList;

public abstract class Kendaraan {
	protected ArrayList<AreaParkir> areaParkir = new ArrayList<AreaParkir>();
	protected int titikParkirKu;
	protected UkuranKendaraan ukuranKendaraan;

	public int getTitikParkirKu() {
		return titikParkirKu;
	}

	public UkuranKendaraan getUkuranKendaraan() {
		return ukuranKendaraan;
	}

	/* Park vehicle in this spot (among others, potentially) */
	public void parkInSpot(AreaParkir ap) {
		areaParkir.add(ap);
	}

	/* Remove car from spot, and notify spot that it's gone */
	public void clearSpots() {

	}

	/*
	 * Checks if the spot is big enough for the vehicle (and is available). This
	 * compares the SIZE only. It does not check if it has enough spots.
	 * 
	 * canFitInToSpot
	 */
	public abstract boolean parkirKosong(AreaParkir areaParkir);
}
