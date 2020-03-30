package com.lrh.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		//被代理对象
		Subject subject = new RealSubject("张三");

		//对被代理对象的方法进行代理，也可以理解实际在这里执行
		SubjectHandler subjectHandler = new SubjectHandler(subject);

		ClassLoader classLoader = subject.getClass().getClassLoader();

		//生成动态代理对象
		Subject proxyInstance = (Subject)Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, subjectHandler);

//		System.out.println(subject);
//		System.out.println(proxyInstance); //只要调用被代理的任何方法都会调用代理的封装 打印就是toString()
		proxyInstance.play();

	}
}
