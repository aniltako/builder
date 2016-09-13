package com.builder.pattern.pizza;

import com.builder.pattern.impl.VegPizza;

public class LargeCheesePizza extends VegPizza {

	@Override
	public float price() {
		return 200.0f;
	}

	@Override
	public String name() {
		return "Cheese Pizza";
	}

	@Override
	public String size() {
		return "Large";
	}

	
}
