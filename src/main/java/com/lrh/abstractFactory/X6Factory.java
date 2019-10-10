package com.lrh.abstractFactory;

public class X6Factory extends AbstractCarFactory {

	@Override
	public BwmX6 createCar() {
		BwmX6 bwmX6 = new BwmX6();
		return bwmX6;
	}

	@Override
	public X6KeyBwmX createKey() {
		X6KeyBwmX x6Key = new X6KeyBwmX();
		return x6Key;
	}
}
