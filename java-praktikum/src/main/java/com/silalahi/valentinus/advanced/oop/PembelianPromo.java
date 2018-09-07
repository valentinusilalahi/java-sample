package com.silalahi.valentinus.advanced.oop;

import java.math.BigDecimal;

public class PembelianPromo extends Pembelian {
    private String namaPromo;
    private String voucher;

    public String getVoucher() {
        return this.voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getNamapromo() {
        return this.namaPromo;
    }

    public void setNamapromo(String namaPromo) {
        this.namaPromo = namaPromo;
    }

    private BigDecimal diskon() {
        return total().multiply(new BigDecimal("0.1"));
    }

}