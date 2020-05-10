package com.lrh.state.simple;

/**
 *  简单的分支逻辑法：
 *  不易扩展，不易维护
 *
 * @description:
 * @author: lrh
 * @date: 2020/5/10 13:46
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setCurState(State.STATE_1);
		context.doSomeThing1();
		System.out.println("--------------");
//		context.doSomeThing2();
		System.out.println("--------------");
		context.doSomeThing3();
	}
}
