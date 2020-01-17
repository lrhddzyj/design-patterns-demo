package com.lrh.adapter;

/**
 * 使用对象组合的的方式实现适配
 */
public class FromJdGoodInfoUseComb implements IGoodInfo {


	private IJdGoodInfo jdGoodInfo;

	public FromJdGoodInfoUseComb(IJdGoodInfo jdGoodInfo) {
		this.jdGoodInfo = jdGoodInfo;
	}

	@Override
	public String getName() {
		return jdGoodInfo.getJdGoodName();
	}

	@Override
	public String getPic() {
		return jdGoodInfo.getJdGoodPic();
	}

	@Override
	public Long getWeight() {
		return Long.parseLong(jdGoodInfo.toString());
	}
}
