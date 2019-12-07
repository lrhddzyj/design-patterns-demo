package com.lrh.mediation;


public abstract class AbstractMediator {

	private Colleague1 colleague1;

	private Colleague2 colleague2;

	public AbstractMediator() {
	}

	public AbstractMediator(Colleague1 colleague1, Colleague2 colleague2) {
		this.colleague1 = colleague1;
		this.colleague2 = colleague2;
	}

	protected Colleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(Colleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	protected Colleague2 getColleague2() {
		return colleague2;
	}

	public void setColleague2(Colleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	public abstract void doSomeThing1();

	public abstract void doSomeThing2();

}
