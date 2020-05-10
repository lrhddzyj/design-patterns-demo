package com.lrh.state.selectTable;

/**
 *  查表法的实现：主要用于状态和动作比较多的情况（游戏中）
 *
 * @description:
 * @author: lrh
 * @date: 2020/5/10 15:32
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setCurState(State.STATE_1);
		context.traceEventA();
//		context.traceEventB();
		context.traceEventC();
	}
}
