package com.lrh.builder;

import java.util.LinkedList;

public abstract class AbstractChef {

	private  LinkedList<String> methodList = new LinkedList();

	protected abstract void addChili(Food food);

	protected abstract void addPepper(Food food);

	protected abstract void addSugar(Food food);

	protected abstract Food cook();

	public LinkedList<String> getMethodList() {
		return methodList;
	}

	public void setMethodList(LinkedList<String> methodList) {
		this.methodList = methodList;
	}
}
