package com.silalahi.valentinus.advanced.oop;

import java.math.BigDecimal;

public class PembelianDetail {
    private String id;
    private Pembelian pembelian;
    private Product product;
    private Integer jumlah;

    public Integer getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Pembelian getPembelian() {
        return this.pembelian;
    }

    public void setPembelian(Pembelian pembelian) {
        this.pembelian = pembelian;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal subTotal() {
        return product.getHarga().multiply(new BigDecimal(jumlah));
    }
}