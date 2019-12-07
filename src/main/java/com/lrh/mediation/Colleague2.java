package com.lrh.mediation;

public class Colleague2 {

	private AbstractMediator abstractMediator;

	public Colleague2(AbstractMediator abstractMediator) {
		this.abstractMediator = abstractMediator;
	}

	public void doSomeThing2(){
		System.out.println("同事2完成事2");
	}

	public void doSomeThingNeedAssist(){
		System.out.println("同事2处理需要中介协助的事情");
		this.abstractMediator.doSomeThing1();
	}
}
