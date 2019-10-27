package com.lrh.proxy.dynamicAndAdvice;

public class RealSubject implements Subject {

	private String name;

	public RealSubject(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println(this.name + "玩游戏");
	}
}
