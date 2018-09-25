package com.valentinus.silalahi.latihan.diskon;

import java.math.BigDecimal;

public class PerhitunganDiskonPeriode implements DiskonBersyarat {
    private Pembelian pembelian;
    
    public BigDecimal hitungDiskon(Pembelian p){
        this.pembelian = p;
        if(berlaku()){
            return new BigDecimal(0.2)
            .multiply(p.hitungTotalDiskon());
        }
		return null;
    }

	@Override
	public Boolean berlaku() {
		// TODO Auto-generated method stub
		return null;
	}
    
//    public Boolean berlaku(){
//        return dekatTahunBaru(pembelian.getWaktu());
//    }
    
//    private Boolean dekatTahunBaru(Date waktu){
//        // kalau bulan desember return true
//    }
}
