package com.lrh.builderAndTemplateMethod;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		Product aProduct = director.getAProduct();
		aProduct.doSomeThing();
	}
}
