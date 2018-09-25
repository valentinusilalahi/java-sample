package com.valentinus.silalahi.latihan.diskon;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Pembayaran {
    private BigDecimal jumlah;
    private Date waktu;
    
    /*public BigDecimal hitungDiskon(){
        // algoritma perhitungan diskon
    }*/

	public BigDecimal getJumlah() {
		return jumlah;
	}

	public void setJumlah(BigDecimal jumlah) {
		this.jumlah = jumlah;
	}

	public Date getWaktu() {
		return waktu;
	}

	public void setWaktu(Date waktu) {
		this.waktu = waktu;
	}
    
    // generate getter dan setter
    
}
