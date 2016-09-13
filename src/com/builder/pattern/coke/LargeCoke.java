package com.builder.pattern.coke;

import com.builder.pattern.impl.Coke;

public class LargeCoke extends Coke{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public String size() {
		return "Large";
	}

	@Override
	public float price() {
		return 125.0f;
	}

}
