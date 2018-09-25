package com.valentinus.silalahi.latihan.oop1;

public class Discount implements CalculateDiscount {
	private float ammount;
	private String kodePromo;
	private String discount;

	public Discount() {
	}

	public Discount(float ammount, String kodePromo) {
		this.ammount = ammount;
		this.kodePromo = kodePromo;
		switch (kodePromo) {
		case "New Year":
			this.discount = "5%";
			break;

		case "Lebaran":
			this.discount = "10%";
			break;

		case "Harbolnas":
			this.discount = "20%";
			break;

		default:
			this.discount = "0%";
		}
	}

	public float getAmmount() {
		return ammount;
	}

	public void setAmmount(float ammount) {
		this.ammount = ammount;
	}

	public String getKodePromo() {
		return kodePromo;
	}

	public void setKodePromo(String kodePromo) {
		this.kodePromo = kodePromo;
	}

	public String getDiscount() {
		return discount;
	}

	@Override
	public float calculateDiscount(float ammount, String kodePromo) {
		float finalAmmount = 0;
		switch (kodePromo) {
		case "New Year":
			finalAmmount = (float) (ammount * 5) / 100;
			break;

		case "Lebaran":
			finalAmmount = (float) (ammount * 10) / 100;
			break;

		case "Harbolnas":
			finalAmmount = (float) (ammount * 20) / 100;
			break;
		default:
			finalAmmount = ammount;
		}
		return finalAmmount;
	}

	@Override
	public String toString() {
		float total = this.ammount - calculateDiscount(this.ammount, this.kodePromo);
		return "Discount: " + this.discount + "\n" + "Ammount yang harus dibayar: " + total;
	}
}
