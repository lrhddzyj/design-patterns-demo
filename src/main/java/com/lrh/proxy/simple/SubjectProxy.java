package com.lrh.proxy.simple;

public class SubjectProxy implements Subject {

	private Subject subject = null;

	public SubjectProxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void play() {
		subject.play();
	}


}
