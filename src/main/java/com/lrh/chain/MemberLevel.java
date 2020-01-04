package com.lrh.chain;

public enum MemberLevel {

	/**
	 * 钻石
	 */
	DIAMOND(100),
	/**
	 * 黄金
	 */
	GOLD(90),
	/**
	 * 白银
	 */
	SILVER(80),
	/**
	 * 青铜
	 */
	BRONZE(70);
	private Integer level;
	 MemberLevel(int level){
		 this.level = level;
	}

	public int getLevelValue(){
		return this.level;
	}

}
