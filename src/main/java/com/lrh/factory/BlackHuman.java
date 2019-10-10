package com.lrh.factory;

public class BlackHuman extends Human {
	@Override
	public void talk() {
		System.out.println("i am black man");
	}

	@Override
	public String getColor() {
		return "black";
	}
}
