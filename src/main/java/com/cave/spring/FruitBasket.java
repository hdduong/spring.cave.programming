package com.cave.spring;

import java.util.List;

public class FruitBasket {
	private String basketName;
	private List<String> fruits;
	
	public FruitBasket(String basketName, List<String> fruits) {
		this.basketName = basketName;
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return "FruitBasket [basketName=" + basketName + ", fruits=" + fruits + "]";
	}
	
	
}
