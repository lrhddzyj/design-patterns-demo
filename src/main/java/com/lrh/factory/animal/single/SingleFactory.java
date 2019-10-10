package com.lrh.factory.animal.single;

import com.lrh.factory.animal.AbstractAnimalFactory;
import com.lrh.factory.animal.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleFactory extends AbstractAnimalFactory {

	private static Animal instance = null;



	@Override
	public Animal create(Class<? extends Animal> animal) {

		if(instance == null){
			try {
				Class cl= Class.forName(animal.getName());
				Constructor constructor=cl.getDeclaredConstructor();
				constructor.setAccessible(true);
				instance = (Animal)constructor.newInstance();
				return instance;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}

		}

		return instance;
	}


}
