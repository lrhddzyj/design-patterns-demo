package com.lrh.single;


/**
 * 非线程安全
 */
public class ThreadSafeSingleInstanceModelTwo {

	private static ThreadSafeSingleInstanceModelTwo instance = null;

	public static ThreadSafeSingleInstanceModelTwo getInstance(){
		if(instance == null){   // 多个线程可能会同时在这里判true断
//			synchronized(ThreadSafeSingleInstanceModelTwo.class){
			synchronized (ThreadSafeSingleInstanceModelTwo.class){

				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				instance = new ThreadSafeSingleInstanceModelTwo();
			}
		}

		return instance;
	}



}
