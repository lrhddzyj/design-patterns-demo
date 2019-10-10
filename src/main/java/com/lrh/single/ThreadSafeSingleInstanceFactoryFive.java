package com.lrh.single;

import com.lrh.factory.animal.Cat;

/**
 * 利用枚举实现单例
 *
 */
public class ThreadSafeSingleInstanceFactoryFive {

	private ThreadSafeSingleInstanceFactoryFive(){

	}

	private  enum SingleFactoryEnum{

		SINGLE_FACTORY_ENUM {
			@Override
			public void doSomeThing() {

			}
		};

		private  Cat cat = null;
		public  void doSomeThing(){
			System.out.println("cat.hashCode=" + cat.hashCode());
		}

		SingleFactoryEnum(){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cat = new Cat();
		}
	}

	public static Cat getCat(){
		return SingleFactoryEnum.SINGLE_FACTORY_ENUM.cat;
	}

    public static void doSomeThing(){
		 SingleFactoryEnum.SINGLE_FACTORY_ENUM.doSomeThing();
	}


}
