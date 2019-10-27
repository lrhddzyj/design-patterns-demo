package com.lrh.proxy.simple;

public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		Subject proxy = new SubjectProxy(subject);
		proxy.play();
	}
}
