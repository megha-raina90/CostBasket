package com.cts.bo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.cts.exception.NotValidFruitException;
import com.cts.util.FruitCostPerPiece;

/* this class takes  fruits and quantity as input  
	and calculates the cost of the bucket based on
	 some assumed prices of the fruits/piece*/

public class CalculateBucketPrice implements BucketPrice {
	private int sum = 0;
	private String fruit = null;
	private HashMap<String, Integer> basket = new HashMap<String, Integer>();
	private int quantity;

	@Override
	public Map<String,Integer> getUserInput() throws NotValidFruitException {
		Scanner in = new Scanner(System.in);
		System.out.print("provide inputs and  press q to exit.....");
		for (;;) {
			System.out.println("enter fruit name:");
			fruit = in.next();

			if (fruit.equalsIgnoreCase("banana") || fruit.equalsIgnoreCase("orange") || fruit.equalsIgnoreCase("apple")
					|| fruit.equalsIgnoreCase("lemon") || fruit.equalsIgnoreCase("peaches")) {

				System.out.print("Quantity: ");
				quantity = in.nextInt();
			} else {
				if (fruit.equalsIgnoreCase("Q")) {
					break;
				} else
					throw new NotValidFruitException("invalid fruit");
			}

			basket.put(fruit, quantity);
		}
			
			int totalPrice=calculateBucketPrice(basket);
			
			if (totalPrice==0)
			{
				System.out.println("BASKET IS EMPTY");
			}
			else 
			{
				System.out.println("bucket is priced @:"+totalPrice);
			}
			return basket;

		

	}

	// calculates the price of the basket
	@Override
	public int calculateBucketPrice(Map<String, Integer> basket) {

		Set entrySet = basket.entrySet();
		Iterator i = entrySet.iterator();

		while (i.hasNext()) {

			Map.Entry mpEntry = (Entry) i.next();
			String fruitName = (String) mpEntry.getKey();
			Integer fruitQuantity = (Integer) mpEntry.getValue();

			switch (fruitName) {
			case "banana":
				sum = sum + (fruitQuantity * FruitCostPerPiece.BananaCostPerPiece);
				break;

			case "apple":
				sum = sum + (fruitQuantity * FruitCostPerPiece.appleCostPerPiece);
				break;

			default:
				break;
			case "lemon":
				sum = sum + (fruitQuantity * FruitCostPerPiece.lemonCostPerPiece);
				break;

			case "peaches":
				sum = sum + (fruitQuantity * FruitCostPerPiece.peachesCostPerPiece);
				break;

			case "orange":
				sum = sum + (fruitQuantity * FruitCostPerPiece.orangeCostPerPiece);
				break;

			}

		}

		return sum;

	}

}
