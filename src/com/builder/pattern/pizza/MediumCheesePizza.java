package com.builder.pattern.pizza;

import com.builder.pattern.impl.VegPizza;

public class MediumCheesePizza extends VegPizza{

	@Override
	public float price() {
		return 180.0f;
	}

	@Override
	public String name() {
		return "Cheese Pizza";
	}

	@Override
	public String size() {
		return "Medium";
	}

}
