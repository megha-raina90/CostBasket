package com.cts.execute;

import java.util.Map;

import com.cts.bo.CalculateBucketPrice;
import com.cts.exception.NotValidFruitException;

public class Executor {

	// The class kick starts the project
	
	public static void main(String[] args) {
		CalculateBucketPrice cbp= new  CalculateBucketPrice();
		try {
			Map<String ,Integer> basketmap=cbp.getUserInput();
		} catch (NotValidFruitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
