package com.cts.bo;

import java.util.Map;

import com.cts.exception.NotValidFruitException;

public interface BucketPrice {

	
	public int calculateBucketPrice(Map<String, Integer> basket);
}
