package com.lrh.single;

/**
 * 静态内部类的单例
 * 没有获取实例的时候内部类不会被初始化
 */
public class ThreadSafeSingleInstanceModelFour  {

	private static class ThreadSafeSingleInstanceModelFourInnerClass{
		public static final ThreadSafeSingleInstanceModelFour instance = new ThreadSafeSingleInstanceModelFour();
	}


	public static final ThreadSafeSingleInstanceModelFour getInstance(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return ThreadSafeSingleInstanceModelFourInnerClass.instance;
	}

}
