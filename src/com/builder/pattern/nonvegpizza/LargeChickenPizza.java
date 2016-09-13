package com.builder.pattern.nonvegpizza;

import com.builder.pattern.impl.NonVegPizza;

public class LargeChickenPizza extends NonVegPizza{

	@Override
	public String name() {
		return "Chicken Pizza";
	}

	@Override
	public String size() {
		return "Large";
	}

	@Override
	public float price() {
		return 250.0f;
	}

}
