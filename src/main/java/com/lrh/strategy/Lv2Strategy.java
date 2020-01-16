package com.lrh.strategy;

public class Lv2Strategy implements Strategy {
	@Override
	public void sendReward(IntegralInfo integralInfo) {
		System.out.println("为会员 " + integralInfo.getMemberId() + " 发送LV2等级奖品");
	}
}
