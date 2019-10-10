package com.lrh.factory;

public class WriteHuman extends Human {

	@Override
	public void talk() {
		System.out.printf("i ma write human !! ");
	}

	@Override
	public String getColor() {
		return "write";
	}
}
