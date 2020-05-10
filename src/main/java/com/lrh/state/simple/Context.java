package com.lrh.state.simple;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/10 13:40
 */
public class Context {

	private State curState;

	public State getCurState() {
		return curState;
	}

	public void setCurState(State curState) {
		this.curState = curState;
	}

	public void doSomeThing1(){
		if (curState == State.STATE_1) {
			curState = State.STATE_2;
			System.out.println(String.format("执行 %s 相关业务", "doSomeThing1"));
			System.out.println(String.format("从状态 [ %s ] 转换到 状态 [%s]", State.STATE_1, State.STATE_2));
		}else{
			System.out.println(String.format("当前非 %s 状态，不做任何处理", State.STATE_1));
		}
	}

	public void doSomeThing2(){
		if (curState == State.STATE_2) {
			curState = State.STATE_3;
			System.out.println(String.format("执行 %s 相关业务", "doSomeThing2"));
			System.out.println(String.format("从状态 [ %s ] 转换到 状态 [%s]", State.STATE_2, State.STATE_3));
		}else{
			System.out.println(String.format("当前非 %s 状态，不做任何处理", State.STATE_2));
		}



	}

	public void doSomeThing3(){
		if (curState == State.STATE_3) {
			curState = State.STATE_2;
			System.out.println(String.format("执行 %s 相关业务", "doSomeThing3"));
			System.out.println(String.format("从状态 [ %s ] 转换到 状态 [%s]", State.STATE_3, State.STATE_2));
		}else{
			System.out.println(String.format("当前非 %s 状态，不做任何处理", State.STATE_3));
		}

	}

}
