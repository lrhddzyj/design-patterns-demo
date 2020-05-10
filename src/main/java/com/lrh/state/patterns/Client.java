package com.lrh.state.patterns;

/**
 *  状态模式：对于一般的业务：订单的状态，工作流等业务，
 *  缺点： 如果状态太多会造成类膨胀
 *
 * @description:
 * @author: lrh
 * @date: 2020/5/10 14:17
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setCurState(Context.STATE_1);
		context.doSomeThing1();
		System.out.println("当前状态：" + context.getCurState());
		context.doSomeThing2();
		System.out.println("当前状态：" + context.getCurState());
		context.doSomeThing3();
		System.out.println("当前状态：" + context.getCurState());
	}

}
