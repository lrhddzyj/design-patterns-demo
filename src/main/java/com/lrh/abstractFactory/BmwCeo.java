package com.lrh.abstractFactory;

public class BmwCeo {

	public static void main(String[] args) {

		X5Factory x5Factory = new X5Factory();

		X6Factory x6Factory = new X6Factory();

		BwmX5 x5_1 = x5Factory.createCar();
		X5KeyBwmX x5Key = x5Factory.createKey();


		BwmX6 x6_1 = x6Factory.createCar();
		X6KeyBwmX x6Key = x6Factory.createKey();

		// 下面可以做自己的处理了

	}
}
