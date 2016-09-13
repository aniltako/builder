package com.builder.pattern;

import com.builder.pattern.coke.LargeCoke;
import com.builder.pattern.coke.MediumCoke;
import com.builder.pattern.coke.SmallCoke;
import com.builder.pattern.nonvegpizza.LargeChickenPizza;
import com.builder.pattern.nonvegpizza.MediumChickenPizza;
import com.builder.pattern.nonvegpizza.SmallChickenPizza;
import com.builder.pattern.pepsi.LargePepsi;
import com.builder.pattern.pepsi.MediumPepsi;
import com.builder.pattern.pepsi.SmallPepsi;
import com.builder.pattern.pizza.LargeCheesePizza;
import com.builder.pattern.pizza.MediumCheesePizza;
import com.builder.pattern.pizza.SmallCheesePizza;

public class OrderBuilder {

	public OrderedItems prepareItem(String itemType){
		
		OrderedItems orderItem = new OrderedItems();
		
		switch(itemType){
		
		case "SmallChickenPizza":
			orderItem.addItem(new SmallChickenPizza());
			orderItem.addItem(new SmallPepsi());
			break;
		case "LargeChickenPizza":
			orderItem.addItem(new LargeChickenPizza());
			orderItem.addItem(new LargePepsi());
			break;
		case "MediumChickenPizza":
			orderItem.addItem(new MediumChickenPizza());
			orderItem.addItem(new MediumPepsi());
			break;
		case "SmallCheesePizza":
			orderItem.addItem(new SmallCheesePizza());
			orderItem.addItem(new SmallCoke());
			break;
		case "MediumCheesePizza":
			orderItem.addItem(new MediumCheesePizza());
			orderItem.addItem(new MediumCoke());
			break;
		case "LargeCheesePizza":
			orderItem.addItem(new LargeCheesePizza());
			orderItem.addItem(new LargeCoke());
			break;
		default:
			break;
		
		
		}
		
		
		return orderItem;
		
		
		
	}
}
