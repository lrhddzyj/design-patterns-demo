package com.lrh.single;

public class ThreadSafeSingleInstanceModelThree {

	/**
	 *   采用Volatile 和 DCL机制
	 *
	 * volatile 关键字作用 只能保证可见性
	 * 1，多个线程可见
	 * 2，禁止指令重排
	 *
	 * 一般对象的创建步骤   分配地址 -> 初始化属性 -> 指针指向分配地址
	 *
	 * 编译器优化导致指令重排 可能出现
	 * 			分配地址
	 * 			-> 指针指向分配地址（没有初始化 返回是个null对象  原始类型范围内的值（例如int 的范围为-128 ~ 127 ，超过后自动转化为对象创建））
	 * 			->  初始化属性
	 *
	 *
	 *
	 *   Double Check Locking 双检查锁机制（推荐）
	 *    同步块中不检查的情况可能还会多次创建对象
	 *
	 */
	private volatile static ThreadSafeSingleInstanceModelThree instance = null;

	public static ThreadSafeSingleInstanceModelThree getInstance() {

		if (instance == null) {
			synchronized (ThreadSafeSingleInstanceModelThree.class) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (instance == null) {  //此处可能对象已经分配指针但没有初始化  采用 Double Check Locking 双检查锁机制
					instance = new ThreadSafeSingleInstanceModelThree();
				}
			}
		}
		return instance;
	}

}
