package com.builder.pattern.nonvegpizza;

import com.builder.pattern.impl.NonVegPizza;

public class SmallChickenPizza extends NonVegPizza{

	@Override
	public String name() {
		return "Chicken Pizza";
	}

	@Override
	public String size() {
		return "Small";
	}

	@Override
	public float price() {
		return 160.0f;
	}

}
