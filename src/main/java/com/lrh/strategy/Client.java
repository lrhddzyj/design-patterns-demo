package com.lrh.strategy;

public class Client {

	public static void main(String[] args) {

		//创建策略
		Strategy lv1 = new Lv1Strategy();
		Strategy lv2 = new Lv2Strategy();
		Strategy lv3 = new Lv3Strategy();
		//装载到上下文当中
		Context.addStrategy(IntegralGrade.LV1.name(), lv1);
		Context.addStrategy(IntegralGrade.LV2.name(), lv2);
		Context.addStrategy(IntegralGrade.LV3.name(), lv3);


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


		//创建上下文
		Context context = new Context();

		//获取策略并执行
		context.getStrategy(LV1Member.getAmount()).sendReward(LV1Member);
		context.getStrategy(LV2Member.getAmount()).sendReward(LV2Member);
		context.getStrategy(LV3Member.getAmount()).sendReward(LV3Member);
	}
}
