package com.lrh.factory.animal;

import java.util.HashMap;
import java.util.Map;

public class DelayedIntFactory extends AbstractAnimalFactory {

	private final Map<String, Animal>  animalMap = new HashMap();

	@Override
	public synchronized Animal create(Class<? extends Animal> animal) {
		String name = animal.getName();
		if(animalMap.containsKey(name)){
			return animalMap.get(name);
		}else{
			Animal newAnimal = null;
			try {
				newAnimal = animal.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			animalMap.put(name, newAnimal);
			return newAnimal;
		}
	}
}
