package com.cts.bo;

import java.util.Map;

import com.cts.exception.NotValidFruitException;

public interface BucketPrice {

	
	public Map<String,Integer> getUserInput() throws NotValidFruitException;
	public int calculateBucketPrice(Map<String,Integer> map);
}
