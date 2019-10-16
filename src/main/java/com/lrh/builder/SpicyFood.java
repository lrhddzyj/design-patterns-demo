package com.lrh.builder;

public class SpicyFood extends Food {


	@Override
	public void setSpicyWeight(Integer spicyWeight) {
		if(spicyWeight > 20){
			System.out.println("辣度不允许超过20,否则客户不接受");
			return;
		}
		super.setSpicyWeight(spicyWeight);
	}
}
