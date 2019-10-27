package com.lrh.proxy.dynamicAndAdvice;

public class BeforeAdvice implements Advice {

	@Override
	public void exec() {
		System.out.println("执行前通知处理");
	}
}
