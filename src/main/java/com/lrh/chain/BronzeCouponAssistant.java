package com.lrh.chain;

public class BronzeCouponAssistant extends AbstractCouponAssistant {

	public BronzeCouponAssistant(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}

	@Override
	protected void addCouponToPackage(Member member) {
		System.out.println("为会员 {" + member.toString() + "}增加 青铜卡券");
	}
}
