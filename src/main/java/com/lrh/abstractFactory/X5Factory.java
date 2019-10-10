package com.lrh.abstractFactory;

public class X5Factory extends AbstractCarFactory {
	@Override
	public BwmX5 createCar() {
		BwmX5 bwmX5 = new BwmX5();
		return bwmX5;
	}

	@Override
	public X5KeyBwmX createKey() {
		X5KeyBwmX x5Key = new X5KeyBwmX();
		return x5Key;
	}
}
