package com.cts.exception;

public class NotValidFruitException extends Exception {
	String message;

	public NotValidFruitException(String message) {
		this.message = message;
	}
}
