package com.lrh.chain;

public class ChainPatternDenoClient {



	public static void main(String[] args) {
		AbstractCouponAssistant couponAssistant = getCouponAssistantChain();

		Member diamondMember = new Member("钻石王", MemberLevel.DIAMOND);
		Member goldMember = new Member("黄金张", MemberLevel.GOLD);
		Member silverMember = new Member("白银黄", MemberLevel.SILVER);
		Member bronzeMember = new Member("青铜吴", MemberLevel.BRONZE);


		System.out.println("开始发送卡券");
		couponAssistant.sendCoupon(diamondMember);

		System.out.println("=====发送下一个====");
		couponAssistant.sendCoupon(goldMember);

		System.out.println("=====发送下一个====");
		couponAssistant.sendCoupon(silverMember);

		System.out.println("=====发送下一个====");
		couponAssistant.sendCoupon(bronzeMember);

	}

	private static AbstractCouponAssistant getCouponAssistantChain() {
		DiamondCouponAssistant diamondCouponAssistant = new DiamondCouponAssistant(MemberLevel.DIAMOND.getLevelValue());
		GoldCouponAssistant goldCouponAssistant = new GoldCouponAssistant(MemberLevel.GOLD.getLevelValue());
		SilverCouponAssistant silverCouponAssistant = new SilverCouponAssistant(MemberLevel.SILVER.getLevelValue());
		BronzeCouponAssistant bronzeCouponAssistant = new BronzeCouponAssistant(MemberLevel.BRONZE.getLevelValue());
		diamondCouponAssistant.setNext(goldCouponAssistant);
		goldCouponAssistant.setNext(silverCouponAssistant);
		silverCouponAssistant.setNext(bronzeCouponAssistant);
		return diamondCouponAssistant;
	}


}
