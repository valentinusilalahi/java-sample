package com.silalahi.valentinus.advanced.parkiran;

public class Mobil extends Kendaraan {

	public Mobil() {
		titikParkirKu = 2;
		ukuranKendaraan = UkuranKendaraan.AREA_PARKIR_MOBIL;
	}

	@Override
	public boolean parkirKosong(AreaParkir areaParkir) {
		// TODO Auto-generated method stub
		return false;
	}

}
