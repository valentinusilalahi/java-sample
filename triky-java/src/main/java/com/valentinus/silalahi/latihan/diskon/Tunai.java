package com.valentinus.silalahi.latihan.diskon;

import java.math.BigDecimal;

public class Tunai extends Pembayaran {
	private BigDecimal bayar;

	public BigDecimal hitungKembalian() {
		return bayar.subtract(getJumlah());
	}

	public BigDecimal getBayar() {
		return bayar;
	}

	public void setBayar(BigDecimal bayar) {
		this.bayar = bayar;
	}

}
