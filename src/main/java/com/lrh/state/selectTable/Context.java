package com.lrh.state.selectTable;

import static com.lrh.state.selectTable.Event.*;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/10 15:26
 */
public class Context {

	private State curState;

	public State getCurState() {
		return curState;
	}

	public void setCurState(State curState) {
		this.curState = curState;
	}

	public void traceEventA(){
		executeEvent(EVENT_A);
	}

	public void traceEventB(){
		executeEvent(EVENT_B);
	}

	public void traceEventC(){
		executeEvent(EVENT_C);
	}

	private void executeEvent(Event event) {
		State newCurState = TransitionTable.getStateWithAfterEvent(curState, event);
		String actionWithAfterEvent = TransitionTable.getActionWithAfterEvent(curState, event);
		System.out.println("当前状态为：" + newCurState);
		System.out.println("执行动作：" + actionWithAfterEvent);
		System.out.println("----------------------------------");
		this.curState = newCurState;
	}

}
