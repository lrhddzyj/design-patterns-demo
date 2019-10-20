package com.lrh.builderAndTemplateMethod;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class BBuilder extends AbstractBuilder {

	private List<String> aList = new ArrayList();
	private List<String> bList = new ArrayList();
	private List<String> cList = new ArrayList();


	private Product product = new BProduct();

	@Override
	protected Product build() {
		if(CollectionUtils.isEmpty(aList)){
			methodA();
		}
		methodC();
		if(CollectionUtils.isEmpty(bList)){
			methodB();
		}

		// 一些业务逻辑处理
		return product;
	}


	@Override
	public void setPart() {
		//避免引起逻辑错误
		aList.clear();
		bList.clear();
		cList.clear();

		bList.add("A1");
		bList.add("A2");
		bList.add("A3");

		cList.add("B2");
	}
}
