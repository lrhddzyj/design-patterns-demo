package com.lrh.adapter;

public class UseExtendClient {

	public static void main(String[] args) {
		IGoodInfo goodInfo = new FromIJdGoodInfo();
		goodInfo.getName();
		goodInfo.getPic();
		goodInfo.getWeight();
	}
}
