package com.lrh.strategy;

public class UseEnumStrategyClient {

	public static void main(String[] args) {
		//会员积分信息
		IntegralInfo LV1Member = IntegralInfo.builder()
				.amount(50L)
				.memberId("LV1Member")
				.build();

		IntegralInfo LV2Member = IntegralInfo.builder()
				.amount(109L)
				.memberId("LV2Member")
				.build();

		IntegralInfo LV3Member = IntegralInfo.builder()
				.amount(10999L)
				.memberId("LV3Member")
				.build();

		StrategyEnum.get(LV1Member.getAmount()).sendReward(LV1Member);
		StrategyEnum.get(LV2Member.getAmount()).sendReward(LV2Member);
		StrategyEnum.get(LV3Member.getAmount()).sendReward(LV3Member);

	}
}
