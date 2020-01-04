package com.lrh.chain;

public class GoldCouponAssistant extends AbstractCouponAssistant {

	public GoldCouponAssistant(Integer memberLevel){
		this.memberLevel = memberLevel;
	}

	@Override
	protected void addCouponToPackage(Member member) {
		System.out.println("为会员 {" + member.toString() + "}增加 黄金卡券");
	}
}
