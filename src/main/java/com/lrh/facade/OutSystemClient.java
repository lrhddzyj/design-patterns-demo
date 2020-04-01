package com.lrh.facade;

/**
 * 模拟外部系统访问
 *
 */
public class OutSystemClient {

	public static void main(String[] args) {
		Facade facade = new Facade();

		facade.doSomeThingA();
		facade.doSomeThingB();
		facade.doSomeThingC();
	}
}
