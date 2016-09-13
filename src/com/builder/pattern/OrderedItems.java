package com.builder.pattern;

import java.util.ArrayList;
import java.util.List;

import com.builder.pattern.impl.Item;

public class OrderedItems {
	
	List<Item> orderedItems  = new ArrayList<>();
	
	
	public void addItem(Item item){
		
		orderedItems.add(item);
	}
	
	
	public float getCost(){
		
		float cost = 0.0f;
		
		for(Item item : orderedItems){
			
			cost+= item.price();
			
		}
		
		return cost;
	}
	
	public void showItems(){
		
		for(Item item : orderedItems){
			
			System.out.println("Item is :" + item.name());
			System.out.println("Size is :" + item.size());
			System.out.println("Price is :" + item.price());
			
			System.out.println("\n");
		}
	}

}
