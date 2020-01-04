package com.lrh.chain;

public abstract class AbstractCouponAssistant {


	protected Integer memberLevel;

	protected AbstractCouponAssistant nextCouponAssistant;

	protected void setNext(AbstractCouponAssistant couponAssistant) {
		this.nextCouponAssistant = couponAssistant;
	}

	public  void sendCoupon(Member member){
		if(member.getMemberLevel().getLevelValue() >= memberLevel){
			 this.addCouponToPackage(member);
		}
		if(nextCouponAssistant != null){
			nextCouponAssistant.sendCoupon(member);
		}
	}

	/**
	 *  增加卡券到卡包
	 * @param member
	 */
	protected  abstract void addCouponToPackage(Member member) ;
}
