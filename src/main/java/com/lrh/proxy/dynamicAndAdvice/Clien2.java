package com.lrh.proxy.dynamicAndAdvice;

public class Clien2 {

	public static void main(String[] args) {
		Subject subject = new RealSubject("张三");
		Subject proxy = SubjectDynamicProxy.newSubjectProxyInstance(subject);
		proxy.play();

	}
}
