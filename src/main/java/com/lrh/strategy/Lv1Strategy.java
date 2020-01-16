package com.lrh.strategy;

public class Lv1Strategy implements Strategy {

	@Override
	public void sendReward(IntegralInfo integralInfo) {
		System.out.println("为会员 " + integralInfo.getMemberId() +" 发送LV1的奖品");
	}
}
