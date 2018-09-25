package com.valentinus.silalahi.latihan.abstraksi;

public class CoffeeException extends Exception {
	public CoffeeException() {
		super();
	}

	public CoffeeException(String message, Throwable cause, boolean enableSuppression, boolean writeableStckTrace) {
		super(message, cause, enableSuppression, writeableStckTrace);
	}

	public CoffeeException(String message, Throwable cause) {
		super(message, cause);
	}

	public CoffeeException(String message) {
		super(message);
	}

	public CoffeeException(Throwable cause) {
		super(cause);
	}
}
