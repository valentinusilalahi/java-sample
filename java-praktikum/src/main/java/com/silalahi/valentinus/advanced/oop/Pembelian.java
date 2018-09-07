package com.silalahi.valentinus.advanced.oop;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Pembelian {
    private String id;
    private LocalDateTime waktuTransaksi = LocalDateTime.now();
    private String customer;

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDateTime getWaktutransaksi() {
        return this.waktuTransaksi;
    }

    public void setWaktutransaksi(LocalDateTime waktuTransaksi) {
        this.waktuTransaksi = waktuTransaksi;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    Set<PembelianDetail> daftarBelanja = new HashSet<>();

    public BigDecimal total() {
        BigDecimal hasil = BigDecimal.ZERO();

        for (PembelianDetail pd : daftarBelanja) {
            hasil = hasil.add(pd.subTotal());
        }
        return hasil;
    }
}