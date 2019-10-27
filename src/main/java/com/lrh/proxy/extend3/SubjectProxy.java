package com.lrh.proxy.extend3;

public class SubjectProxy implements Proxy,Subject {

	private Subject subject = null;

	public SubjectProxy(String name) throws Exception {
		this.subject = new RealSubject(this, name);
	}

	@Override
	public void charge() {
		System.out.println("本次收费100元");
	}

	@Override
	public void play() {
		this.subject.play();
		this.charge();
	}
}
