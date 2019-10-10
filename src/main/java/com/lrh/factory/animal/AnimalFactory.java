package com.lrh.factory.animal;

public class AnimalFactory extends AbstractAnimalFactory {

	@Override
	public Animal create(Class<? extends Animal> animal) {
		Animal animal1 = null;
		try {
			 animal1 = animal.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return animal1;
	}
}
