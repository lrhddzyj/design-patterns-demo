package com.lrh.single;

/**
 * 饿汉
 * 线程安全的单例
 * 但是锁粒度比较大 class锁
 *
 */
public class ThreadSafeSingleInstanceModelOne {

	private static ThreadSafeSingleInstanceModelOne threadSafeSingleInstanceModelOne = null;

	private ThreadSafeSingleInstanceModelOne(){

	}

	/**
	 *
	 * @return
	 */
	public synchronized static ThreadSafeSingleInstanceModelOne getInstance(){

		if(threadSafeSingleInstanceModelOne == null){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			threadSafeSingleInstanceModelOne = new ThreadSafeSingleInstanceModelOne();
		}
		return threadSafeSingleInstanceModelOne;

	}

}
