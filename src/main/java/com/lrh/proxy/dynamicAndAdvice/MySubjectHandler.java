package com.lrh.proxy.dynamicAndAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MySubjectHandler implements InvocationHandler {

	private Object target;

	public MySubjectHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//这里主要是对实现的业务逻辑的增强
		 System.out.println("先处理我想增加的业务逻辑");
		return method.invoke(target, args);
	}
}
