package com.lrh.builder;

public class SpicyFoodChef extends AbstractChef {


	@Override
	protected void addChili(Food food) {
		food.setSpicyWeight(10);
		System.out.println("+辣椒");
	}

	@Override
	protected void addPepper(Food food) {
		System.out.println("+麻椒");
	}

	@Override
	protected void addSugar(Food food) {
		System.out.println("+糖");
	}

	@Override
	protected Food cook() {
		SpicyFood spicyFood = new SpicyFood();
		super.getMethodList().stream().forEach(method ->{
			if("addChili".equals(method)){
				this.addChili(spicyFood);
			}
			if("addPepper".equals(method)){
				this.addPepper(spicyFood);
			}
			if("addSugar".equals(method)){
				this.addSugar(spicyFood);
			}
		});

		return spicyFood;
	}
}
