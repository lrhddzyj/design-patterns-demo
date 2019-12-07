package com.lrh.mediation;

public class ConcreteMediator extends AbstractMediator {

	public ConcreteMediator() {
		super();
	}

	public ConcreteMediator(Colleague1 colleague1, Colleague2 colleague2) {
		super(colleague1, colleague2);
	}

	@Override
	public void doSomeThing1() {
		this.getColleague1().doSomething1();
	}

	@Override
	public void doSomeThing2() {
		this.getColleague2().doSomeThing2();
	}
}
