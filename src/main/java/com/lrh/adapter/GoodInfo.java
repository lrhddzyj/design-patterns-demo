package com.lrh.adapter;

import lombok.Data;

@Data
public class GoodInfo implements IGoodInfo {


	@Override
	public String getName() {
		System.out.println("商品名称是XXX");
		return null;
	}

	@Override
	public String getPic() {
		System.out.println("商品的图片是XXX");
		return null;
	}

	@Override
	public Long getWeight() {
		System.out.println("商品的重量是XXX");
		return null;
	}
}
