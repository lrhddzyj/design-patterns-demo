package com.lrh.proxy.extend1;

public class RealSubject implements Subject{

	private String name;

	@Override
	public void play() {
		System.out.printf(this.name + "开始玩游戏");
	}

	public RealSubject(Subject proxy,String name) throws Exception {
		//这里只是简单的演示 判断条件可自定义控制
		if(proxy == null){
			throw new Exception("不能创建真实对象");
		}
		this.name = name;
	}
}
