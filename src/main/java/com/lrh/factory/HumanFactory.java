package com.lrh.factory;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman(Class<? extends Human> c) {
		Human human=null;

		try {
			//产生一个人种
			human = c.newInstance();
		} catch (Exception e) {
			System.out.println("人种生成错误！");
		}
		return human;

	}
}
