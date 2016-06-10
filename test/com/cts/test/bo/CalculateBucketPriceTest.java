package com.cts.test.bo;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.cts.bo.BucketPrice;
import com.cts.bo.PriceCalculator;
import com.cts.exception.NotValidFruitException;

public class CalculateBucketPriceTest {

	private PriceCalculator buckprice;
	Map<String, Integer> basket;
	

	@Before
	public void setUp() {

		buckprice = new PriceCalculator();
		basket = new HashMap<String, Integer>();
		
	}

	@Test
	public void calculateBucketPrice_ShouldReturnSomeValue() {

		int result = buckprice.calculateBucketPrice(basket);
		assertNotNull(result);

	}

	@Test
	public void calculateBucketPrice_ShouldReturnZero() {
		basket = Collections.emptyMap();
		int result = buckprice.calculateBucketPrice(basket);
		assertNotNull(result);
		assertEquals(0, result);
	}

	

	

}
