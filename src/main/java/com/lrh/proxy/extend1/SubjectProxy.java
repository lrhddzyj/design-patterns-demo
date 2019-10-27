package com.lrh.proxy.extend1;

public class SubjectProxy implements Subject {

	private Subject subject = null;

	public SubjectProxy(String name) throws Exception {
		this.subject = new RealSubject(this, name);
	}

	@Override
	public void play() {
		this.subject.play();
	}
}
