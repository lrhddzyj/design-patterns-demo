package com.lrh.chain;

public class DiamondCouponAssistant extends AbstractCouponAssistant {

	public DiamondCouponAssistant(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}

	@Override
	protected void addCouponToPackage(Member member) {
		System.out.println("为会员 {" + member.toString() + "}增加 钻石卡券");
	}
}
