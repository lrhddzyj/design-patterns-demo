package com.lrh.proxy.extend3;

public class Client {

	public static void main(String[] args) throws Exception {
		Subject proxy = new SubjectProxy("张三");
		proxy.play();


	}
}