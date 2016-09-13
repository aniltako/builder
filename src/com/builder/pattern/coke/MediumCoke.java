package com.builder.pattern.coke;

import com.builder.pattern.impl.Coke;

public class MediumCoke extends Coke{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public String size() {
		return "Medium";
	}

	@Override
	public float price() {
		return 75.0f;
	}

}
