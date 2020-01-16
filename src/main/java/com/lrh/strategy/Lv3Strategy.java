package com.lrh.strategy;

public class Lv3Strategy implements Strategy {
	@Override
	public void sendReward(IntegralInfo integralInfo) {
		System.out.println("为会员 " + integralInfo.getMemberId() +" 发送LV3等级奖品");
	}
}
