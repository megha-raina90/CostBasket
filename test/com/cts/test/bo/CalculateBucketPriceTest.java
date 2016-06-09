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
import com.cts.bo.CalculateBucketPrice;
import com.cts.exception.NotValidFruitException;

public class CalculateBucketPriceTest {

	private CalculateBucketPrice buckprice;
	Map<String, Integer> basket;
	//@Mock
	//Scanner scanner;

	@Before
	public void setUp() {

		buckprice = new CalculateBucketPrice();
		basket = new HashMap<String, Integer>();
		//MockitoAnnotations.initMocks(this);
		//Mockito.mock(Scanner.class);

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

	@Test
	public void getUserInputShouldTakeUserInput() throws NotValidFruitException {

		Map<String, Integer> bucketmap = buckprice.getUserInput();
		assertNotNull(bucketmap);
		equals(bucketmap);

	}

	

}
