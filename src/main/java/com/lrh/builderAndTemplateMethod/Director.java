package com.lrh.builderAndTemplateMethod;

public class Director {

	private ABuilder aBuilder = new ABuilder();
	private BBuilder bBuilder = new BBuilder();

	public Product getAProduct(){
		return aBuilder.build();
	}

	public Product getBProduct(){
		return bBuilder.build();
	}

}
