package com.builder.pattern.pepsi;

import com.builder.pattern.impl.Pepsi;

public class SmallPepsi extends Pepsi{

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public String size() {
		return "Small";
	}

	@Override
	public float price() {
		return 50.0f;
	}

}
