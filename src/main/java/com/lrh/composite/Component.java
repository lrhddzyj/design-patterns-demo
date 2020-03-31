package com.lrh.composite;

/**
 * 构件
 */
public abstract class Component {

	private String name;

	private Component parent;

	public Component() {
	}

	public Component(String name, Component parent) {
		this.name = name;
		this.parent = parent;
	}

	public abstract void doSomeThing();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Component getParent() {
		return parent;
	}

	public void setParent(Component parent) {
		this.parent = parent;
	}
}
