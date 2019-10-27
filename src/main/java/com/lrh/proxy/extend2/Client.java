package com.lrh.proxy.extend2;

public class Client {

	public static void main(String[] args) {
		Subject realSubject = new RealSubject("张三");

		Subject proxy = realSubject.getProxy();

		proxy.play();
	}
}
