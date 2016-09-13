package com.builder.pattern.pepsi;

import com.builder.pattern.impl.Pepsi;

public class LargePepsi extends Pepsi{

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public String size() {
		return "Large";
	}

	@Override
	public float price() {
		return 120.0f;
	}

}
