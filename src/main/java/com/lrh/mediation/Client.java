package com.lrh.mediation;

public class Client {

	public static void main(String[] args) {
		AbstractMediator abstractMediator = new ConcreteMediator();
		Colleague1 colleague1 = new Colleague1(abstractMediator);
		Colleague2 colleague2 = new Colleague2(abstractMediator);
		abstractMediator.setColleague1(colleague1);
		abstractMediator.setColleague2(colleague2);


		colleague1.doSomeThingNeedAssist();

//		colleague2.doSomeThingNeedAssist();
	}
}
