package com.lrh.single;

/**
 * 简单的饿汉式单例模式
 * 线程安全 如果从始至终未用可能造成资源浪费
 *
 * @author lrh
 */
public class SimpleHungrySingleInstance {

	private static final SimpleHungrySingleInstance instance = new SimpleHungrySingleInstance();

	private SimpleHungrySingleInstance(){

	}

	public static SimpleHungrySingleInstance getSingleInstance(){
		return instance;
	}

}
