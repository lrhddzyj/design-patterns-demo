package com.lrh.proxy.dynamicAndAdvice;

public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject("张三");
		ClassLoader classLoader = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		MySubjectHandler mySubjectHandler = new MySubjectHandler(subject);
		Subject proxyInstance = DynamicProxy.newProxyInstance(classLoader, interfaces, mySubjectHandler);
		proxyInstance.play();
	}

}
