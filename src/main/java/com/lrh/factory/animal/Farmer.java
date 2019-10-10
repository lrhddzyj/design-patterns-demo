package com.lrh.factory.animal;

import com.lrh.factory.animal.single.SingleFactory;

public class Farmer {

	public static void main(String[] args) {
		AbstractAnimalFactory animalFactory = new AnimalFactory();

//		AbstractAnimalFactory singleFactory = new SingleFactory();
//
//
//		Animal c1 = singleFactory.create(Cat.class);
//		Animal c2 = singleFactory.create(Sheep.class);
//		c1.eat();
//		c2.eat();
//		System.out.println(c1.hashCode());
//		System.out.println(c2.hashCode());

		AbstractAnimalFactory delayedIntFactory = new DelayedIntFactory();
		Animal d1 = delayedIntFactory.create(Cat.class);
		Animal d2 = delayedIntFactory.create(Cat.class);
		Animal d3 = delayedIntFactory.create(Sheep.class);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		d1.eat();
		d2.eat();
		d3.eat();


		Animal cat = animalFactory.create(Cat.class);
		cat.eat();

		Animal sheep = animalFactory.create(Sheep.class);
		sheep.eat();
	}
}
