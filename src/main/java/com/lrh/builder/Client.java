package com.lrh.builder;

public class Client {

	public static void main(String[] args) {
		AbstractChef abstractChef = new SpicyFoodChef();
		System.out.println("我要吃微辣的");

		abstractChef.getMethodList().add("addChili");
		Food food = abstractChef.cook();
		System.out.println("菜的辣度" + food.getSpicyWeight());

	}
}
