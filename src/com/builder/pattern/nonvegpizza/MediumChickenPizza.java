package com.builder.pattern.nonvegpizza;

import com.builder.pattern.impl.NonVegPizza;

public class MediumChickenPizza extends NonVegPizza{

	@Override
	public String name() {
		return "Chicken Pizza";
	}

	@Override
	public String size() {
		return "Medium";
	}

	@Override
	public float price() {
		return 180.0f;
	}

}
