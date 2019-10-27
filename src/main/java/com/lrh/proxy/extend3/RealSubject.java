package com.lrh.proxy.extend3;

public class RealSubject implements Subject {

	private String name;

	public RealSubject(Subject subject,String name) throws Exception {
		if(subject == null){
			throw new Exception("请使用代理访问");
		}
		this.name = name;
	}


	@Override
	public void play() {
		System.out.println(this.name + "玩游戏");
	}
}
