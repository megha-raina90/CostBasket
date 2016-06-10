package com.cts.execute;

import java.util.Map;

import com.cts.bo.PriceCalculator;
import com.cts.exception.NotValidFruitException;

public class Executor {

	
	
	public static void main(String[] args) {
		PriceCalculator priceCalculator= new  PriceCalculator();
		try {
			priceCalculator.getUserInput();
		} catch (NotValidFruitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
