package com.lrh.proxy.dynamicAndAdvice;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {

	public static Subject newSubjectProxyInstance(Subject subject){
		ClassLoader classLoader = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		InvocationHandler mySubjectHandler = new MySubjectHandler(subject);
		return newProxyInstance(classLoader, interfaces, mySubjectHandler);
	}
}
