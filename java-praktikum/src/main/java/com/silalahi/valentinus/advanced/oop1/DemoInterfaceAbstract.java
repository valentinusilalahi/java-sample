package com.silalahi.valentinus.advanced.oop1;

public class DemoInterfaceAbstract {
	public static void main(String[] args) {
		PenyimpananData pd = new PenyimpanandiFile();
		pd.simpan("Hallo Dunia!");

		DataExport export = new CSVDataExport();
		export.execute();
	}
}
