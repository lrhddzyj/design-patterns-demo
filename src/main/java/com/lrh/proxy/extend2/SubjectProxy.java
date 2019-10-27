package com.lrh.proxy.extend2;

public class SubjectProxy implements Subject {
	private Subject subject = null;

	public SubjectProxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void play() {
		this.subject.play();
	}

	@Override
	public Subject getProxy() {
		return this;
	}


}
