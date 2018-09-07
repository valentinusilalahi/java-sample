package com.silalahi.valentinus.advanced.oop;

import java.math.BigDecimal;

public class Product {
    private String id;
    private String nama;
    private String kode;
    private BigDecimal harga;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}