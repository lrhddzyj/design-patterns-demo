package com.lrh.proxy.simple;

public class RealSubject implements Subject{
	@Override
	public void play() {
		System.out.printf("开始玩游戏");
	}
}
