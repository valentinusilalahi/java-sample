package com.valentinus.silalahi.latihan.diskon;

import java.math.BigDecimal;

public class PerhitunganDiskonTotalPajakPpn 
    implements Diskon, Pajak {
    
    private BigDecimal minimalDiskon;
    private BigDecimal persentaseDiskon;
    
    private BigDecimal persentasePajak;
    
    public BigDecimal hitungDiskon(Pembelian p){
        if(p.hitungTotalPembelian().compareTo(minimalDiskon)>0){
            return p.hitungTotalPembelian()
                .multiply(persentaseDiskon);
        }
		return minimalDiskon;
    }
    
    public BigDecimal hitungPajak(Pembelian p){
        return persentasePajak
        .multiply(p.hitungTotalPembelian());
    }
    
    // getter setter digenerate pakai Netbeans
}
