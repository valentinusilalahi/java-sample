package com.silalahi.valentinus.advanced.oop1;

public abstract class DataExport {
	public void ambilData() {
		System.out.println("Select * from Produk");
	}

	public abstract void exportData();

	public final void execute() {
		ambilData();
		exportData();
	}
}
