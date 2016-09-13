package com.builder.pattern.pepsi;

import com.builder.pattern.impl.Pepsi;

public class MediumPepsi extends Pepsi{

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public String size() {
		return "Medium";
	}

	@Override
	public float price() {
		return 80.f;
	}

}
