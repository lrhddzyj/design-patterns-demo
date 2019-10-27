package com.lrh.proxy.dynamicAndAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {

	public  static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler){
		//这里只是模拟条件，可以根据实际需要判断
		if(true){

			// 在连接点做前置通知，不影响后续业务增加
			(new BeforeAdvice()).exec();
		}
		return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
	}
}
