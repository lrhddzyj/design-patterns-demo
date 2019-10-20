package com.lrh.builderAndTemplateMethod;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ABuilder extends AbstractBuilder {

	private List<String> aList = new ArrayList();
	private List<String> bList = new ArrayList();
	private List<String> cList = new ArrayList();


	private Product product = new AProduct();

	@Override
	protected Product build() {
		if(CollectionUtils.isEmpty(aList)){
			methodA();
		}
		if(CollectionUtils.isEmpty(bList)){
			methodA();
		}
		methodC();

		// 一些业务逻辑处理
		return product;
	}


	@Override
	public void setPart() {
		//避免引起逻辑错误
		aList.clear();
		bList.clear();
		cList.clear();

		aList.add("A1");
		aList.add("A2");
		aList.add("A3");

		bList.add("B2");
	}
}
