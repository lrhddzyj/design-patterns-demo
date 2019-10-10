package com.lrh.single;

/**
 * 简单的懒汉式单例
 * 非线程安全
 */
public class SimpleSluggardSingleInstance {

	private static  SimpleSluggardSingleInstance instance = null;

	private SimpleSluggardSingleInstance(){

	}

	public static SimpleSluggardSingleInstance getInstance()  {
		if(instance == null){
			// 假设创建实例之前可能会有一些准备性的耗时工作
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new SimpleSluggardSingleInstance();
		}
		return instance;
	}


}
