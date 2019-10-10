package com.lrh.single;

import java.io.Serializable;


public class ThreadSafeSingleInstanceModelSix implements Serializable {

	/**
	  *  序列化可以保证单例的安全
	 *  但反序列化的过程是readObject() 会创建一个新的对象，readResolve 特性允许你用   创建的实例代替另外一个实例，
	 *    该方法忽略了被反序列化的对象，因此返回类初始化创建的那个特殊的实例
	 *    因此 实例的序列 化形式不应该包含任何实际的数据;所有的实例字段都应该被声明为 。
	 *    事实上， 如果依赖readResolve 进行实例控制，带有对象引用类型的所有实例字段都必须声明为 transient 。
	 *
	 */
	private volatile static ThreadSafeSingleInstanceModelSix instance = null;

	//标记为transient
	private transient String testName = "";

	public static ThreadSafeSingleInstanceModelSix getInstance() {

		if (instance == null) {
			synchronized (ThreadSafeSingleInstanceModelSix.class) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (instance == null) {  //此处可能对象已经分配指针但没有初始化  采用 Double Check Locking 双检查锁机制
					instance = new ThreadSafeSingleInstanceModelSix();
				}
			}
		}
		return instance;
	}

	private Object readResolve() {
		// Return the one true Elvis and let the garbage collector
		// take care of the Elvis impersonator.
		return instance;
	}

}
