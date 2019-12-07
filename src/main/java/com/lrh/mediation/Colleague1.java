package com.lrh.mediation;

public class Colleague1 {

	private AbstractMediator abstractMediator;

	public Colleague1(AbstractMediator abstractMediator){
		this.abstractMediator = abstractMediator;
	}

	public void doSomething1(){
		System.out.println("同事1完成的事1");
	}

	public void doSomeThingNeedAssist(){
		System.out.println("同事1处理需要中介协助的事情");
		this.abstractMediator.doSomeThing2();
	}



}
