package com.lrh.factory;

public class YellowHuman extends Human {

	@Override
	public void talk() {
		System.out.println("i am yellow human");
	}

	@Override
	public String getColor() {
		return "yellow";
	}
}
