package com.lrh.state.patterns;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/10 14:05
 */
public class Context {

	public static  AbstractState STATE_1;
	public static  AbstractState STATE_2;
	public static  AbstractState STATE_3;

	public Context() {
		STATE_1 = new State1(this);
		STATE_2 = new State2(this);
		STATE_3 = new State3(this);
	}

	private AbstractState curState;

	public AbstractState getCurState() {
		return curState;
	}

	public void setCurState(AbstractState curState) {
		this.curState = curState;
	}


	public  void doSomeThing1(){
		this.curState.doSomeThing1();
	}

	public void doSomeThing2() {
		this.curState.doSomeThing2();
	}

	public void doSomeThing3() {
		this.curState.doSomeThing3();
	}

}
