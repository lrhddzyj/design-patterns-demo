package com.lrh.factory;

public class NvWa {

	public static void main(String[] args) {
		HumanFactory humanFactory = new HumanFactory();

		Human blackHuman = humanFactory.createHuman(BlackHuman.class);
		blackHuman.talk();

	}
}
