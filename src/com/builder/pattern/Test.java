package com.builder.pattern;

public class Test {

	public static void main(String[] args) {

		OrderBuilder builder = new OrderBuilder();
		
		OrderedItems orderedItems = builder.prepareItem("LargeCheesePizza");
		
		orderedItems.showItems();
		
		System.out.println("\n");
		System.out.println("Total cost is : " + orderedItems.getCost());
		
	}

}
