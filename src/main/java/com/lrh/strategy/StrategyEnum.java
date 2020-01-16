package com.lrh.strategy;

import java.util.Arrays;

public enum StrategyEnum {


	LV1(0L,100L){
		@Override
		public void sendReward(IntegralInfo integralInfo) {
			System.out.println("为会员 " + integralInfo.getMemberId() +" 发送LV1的奖品");
		}
	},
	LV2(100L,500L) {
		@Override
		public void sendReward(IntegralInfo integralInfo) {
			System.out.println("为会员 " + integralInfo.getMemberId() + " 发送LV2等级奖品");
		}
	},
	LV3(500L,Long.MAX_VALUE) {
		@Override
		public void sendReward(IntegralInfo integralInfo) {
			System.out.println("为会员 " + integralInfo.getMemberId() +" 发送LV3等级奖品");
		}
	};

	private Long minIntegral;

	private Long maxIntegral;

	StrategyEnum(Long minIntegral,Long maxIntegral){
		this.minIntegral = minIntegral;
		this.maxIntegral = maxIntegral;
	}

	public abstract void sendReward(IntegralInfo integralInfo);

	public static StrategyEnum get(Long integral){
		return Arrays.stream(StrategyEnum.values())
				.filter(integralGrade -> (integral >= integralGrade.getMinIntegral() && integral < integralGrade.getMaxIntegral()))
				.findFirst().get();
	}

	public Long getMinIntegral() {
		return minIntegral;
	}

	public Long getMaxIntegral() {
		return maxIntegral;
	}

}
