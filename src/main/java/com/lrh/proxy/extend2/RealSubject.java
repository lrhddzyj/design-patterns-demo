package com.lrh.proxy.extend2;

public class RealSubject implements Subject {

	private String name;

	private Subject subject = null;

	public RealSubject(String name) {
		this.name = name;
	}

	@Override
	public Subject getProxy(){
		if(this.subject == null){
			this.subject = new SubjectProxy(this);
		}
		return this.subject;
	}

	@Override
	public void play() {
		if(this.isProxy()){
			System.out.println(this.name + "玩游戏");
		}else{
			System.out.println("请使用指定的代理访问");
		}

	}

	public boolean isProxy(){
		return this.subject != null;
	}
}
