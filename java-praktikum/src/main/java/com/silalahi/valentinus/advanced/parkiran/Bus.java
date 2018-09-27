package com.silalahi.valentinus.advanced.parkiran;

public class Bus extends Kendaraan {

	public Bus() {
		titikParkirKu = 3;
		ukuranKendaraan = UkuranKendaraan.AREA_PARKIR_BUS;
	}

	@Override
	public boolean parkirKosong(AreaParkir areaParkir) {
		// TODO Auto-generated method stub
		return false;
	}

}
