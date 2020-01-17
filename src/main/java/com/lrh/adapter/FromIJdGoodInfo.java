package com.lrh.adapter;

/**
 * 使用类继承实现对象适配
 *
 */
public class FromIJdGoodInfo extends JdGoodInfo implements IGoodInfo {

	@Override
	public String getName() {
		return super.getJdGoodName();
	}

	@Override
	public String getPic() {
		return super.getJdGoodPic();
	}

	@Override
	public Long getWeight() {
		return Long.parseLong(super.getJdGoodWeight().toString());
	}
}
