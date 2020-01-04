package com.lrh.chain;

public class SilverCouponAssistant extends AbstractCouponAssistant {

	public SilverCouponAssistant(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}

	@Override
	protected void addCouponToPackage(Member member) {
		System.out.println("为会员 {" + member.toString() + "}增加 白银卡券");
	}
}
