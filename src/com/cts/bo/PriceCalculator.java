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

public class PriceCalculator implements BucketPrice {
	private int priceTotal = 0;
	private String fruitName = null;
	private HashMap<String, Integer> basketContent = new HashMap<String, Integer>();
	private int fruitQuntity;

	/*
	 * This method takes in the input from the user Inputs : Fruit Name and
	 * Fruit Quantity
	 */

	public void getUserInput() throws NotValidFruitException {
		Scanner in = new Scanner(System.in);
		System.out.print("provide inputs and  press q to exit.....");
		for (;;) {
			System.out.println("enter fruit name:");
			fruitName = in.next();

			if (fruitName.equalsIgnoreCase("banana") || fruitName.equalsIgnoreCase("orange")
					|| fruitName.equalsIgnoreCase("apple") || fruitName.equalsIgnoreCase("lemon")
					|| fruitName.equalsIgnoreCase("peaches")) {

				System.out.print("Quantity: ");
				fruitQuntity = in.nextInt();
			} else {
				if (fruitName.equalsIgnoreCase("Q")) {
					break;
				} else
					throw new NotValidFruitException("invalid fruit");
			}

			basketContent.put(fruitName, fruitQuntity);
		}

		int totalPrice = calculateBucketPrice(basketContent);

		if (totalPrice == 0) {
			System.out.println("BASKET IS EMPTY");
		} else {
			System.out.println("bucket is priced @:" + totalPrice);
		}

	}

	// calculates the price of the basket
	@Override
	public int calculateBucketPrice(Map<String, Integer> basket) {

		Set basketContentEntrySet = basket.entrySet();
		Iterator i = basketContentEntrySet.iterator();

		while (i.hasNext()) {

			Map.Entry mpEntry = (Entry) i.next();
			String fruitName = (String) mpEntry.getKey();
			Integer fruitQuantity = (Integer) mpEntry.getValue();

			switch (fruitName) {
			case "banana":
				priceTotal = priceTotal + (fruitQuantity * FruitCostPerPiece.BananaCostPerPiece);
				break;

			case "apple":
				priceTotal = priceTotal + (fruitQuantity * FruitCostPerPiece.appleCostPerPiece);
				break;

			default:
				break;
			case "lemon":
				priceTotal = priceTotal + (fruitQuantity * FruitCostPerPiece.lemonCostPerPiece);
				break;

			case "peaches":
				priceTotal = priceTotal + (fruitQuantity * FruitCostPerPiece.peachesCostPerPiece);
				break;

			case "orange":
				priceTotal = priceTotal + (fruitQuantity * FruitCostPerPiece.orangeCostPerPiece);
				break;

			}

		}

		return priceTotal;

	}

}
