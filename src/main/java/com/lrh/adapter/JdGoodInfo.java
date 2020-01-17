package com.lrh.adapter;

public class JdGoodInfo implements IJdGoodInfo {
	@Override
	public String getJdGoodName() {
		System.out.println("返回JD的商品名称");
		return null;
	}

	@Override
	public String getJdGoodPic() {
		System.out.println("返回JD的商品图片");
		return null;
	}

	@Override
	public Integer getJdGoodWeight() {
		System.out.println("返回JD的商品重量");
		return null;
	}
}
