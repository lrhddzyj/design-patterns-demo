package com.lrh.state.patterns;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/10 14:07
 */
public class State1 extends AbstractState {

	public State1(Context context) {
		super(context);
	}

	@Override
	public void doSomeThing1() {
		super.context.setCurState(Context.STATE_2);
		System.out.println(String.format("执行 %s 相关业务", "doSomeThing1"));
		System.out.println(String.format("从状态 [ %s ] 转换到 状态 [%s]", "STATE_1", "STATE_2"));

	}

	@Override
	public void doSomeThing2() {
		System.out.println(String.format("当前非 %s 状态，不做任何处理", "State1"));
	}

	@Override
	public void doSomeThing3() {
		System.out.println(String.format("当前非 %s 状态，不做任何处理", "State1"));
	}

	@Override
	public String toString() {
		return "State1 ";
	}
}
