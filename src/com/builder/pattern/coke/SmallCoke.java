package com.builder.pattern.coke;

import com.builder.pattern.impl.Coke;

public class SmallCoke extends Coke{

	@Override
	public String name() {
		return "Code";
	}

	@Override
	public String size() {
		return "Small";
	}

	@Override
	public float price() {
		return 45.0f;
	}

}
