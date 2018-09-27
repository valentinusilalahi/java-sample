package com.silalahi.valentinus.advanced.parkiran;

public class Motor extends Kendaraan {
	
	public Motor() {
		titikParkirKu =1;
		ukuranKendaraan = UkuranKendaraan.AREA_PARKIR_MOTOR;
	}

	@Override
	public boolean parkirKosong(AreaParkir areaParkir) {
		// TODO Auto-generated method stub
		return false;
	}

}
