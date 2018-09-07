package com.silalahi.valentinus.advanced.oop;

import java.math.BigDecimal;

public class DemoInheritance {
    public static void main(String[] xxx) {
        Product p = new Product();
        p.setId("P-100");
        p.setKode("P-100");
        p.setnama("Product-001");
        p.setHarga(new BigDecimal("10000"));

        PembelianDetail pd = new PembelianDetail();
        pd.setProduct(p);
        pd.setJumlah(3);

        PembelianPromo pp = new PembelianPromo();
        pp.getDaftarBelanja().add(pd);

        System.out.println("Total Belanja : " + pp.total());
        System.out.println("Diskon : " + pp.Diskon());
        System.out.println("Bayar : " + pp.total().subtract(pp.Diskon()));
    }
}