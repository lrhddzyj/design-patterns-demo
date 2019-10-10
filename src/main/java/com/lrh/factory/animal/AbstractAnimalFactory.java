package com.lrh.factory.animal;

public abstract class AbstractAnimalFactory {

	public abstract Animal create(Class<? extends Animal> animal);

}
