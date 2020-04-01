package com.lrh.facade;

public class Facade {

	/**
	 * 被委托的系统（服务）
	 *
	 */

	private SubSystemA subSystemA = new SubSystemA();
	private SubSystemB subSystemB = new SubSystemB();
	private SubSystemC subSystemC = new SubSystemC();

	/**
	 *
	 * 提供外部访问的方法
	 *
	 */

	public void doSomeThingA(){
		this.subSystemA.doSomeThingA();
	}


	public void doSomeThingB(){
		this.subSystemB.doSomeThingB();
	}


	public void doSomeThingC(){
		this.subSystemC.doSomeThingC();
	}



}
