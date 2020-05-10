package com.lrh.state.patterns;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/10 14:03
 */
public abstract class AbstractState {

	protected Context context;

	public AbstractState(Context context) {
		this.context = context;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public abstract void doSomeThing1();

	public abstract void doSomeThing2();

	public abstract void doSomeThing3();


}
