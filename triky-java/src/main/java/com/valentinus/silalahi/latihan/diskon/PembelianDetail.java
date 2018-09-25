package com.valentinus.silalahi.latihan.diskon;

import java.math.BigDecimal;

public class PembelianDetail {
	private Pembelian pembelian;
	private Produk produk;
	private Integer jumlah;

	public BigDecimal hitungSubtotal() {
		return produk.getHarga().multiply(new BigDecimal(jumlah));
	}

	public Pembelian getPembelian() {
		return pembelian;
	}

	public void setPembelian(Pembelian pembelian) {
		this.pembelian = pembelian;
	}

	public Produk getProduk() {
		return produk;
	}

	public void setProduk(Produk produk) {
		this.produk = produk;
	}

	public Integer getJumlah() {
		return jumlah;
	}

	public void setJumlah(Integer jumlah) {
		this.jumlah = jumlah;
	}

}
