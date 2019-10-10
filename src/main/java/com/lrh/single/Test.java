package com.lrh.single;


import com.lrh.factory.animal.Cat;

public class Test {

	private static int len = 20;

	public static void main(String[] args) {
//		testSluggardSingleInstanceThread();
//		testHungrySingleInstanceThread();
//		testThreadSafeSingleInstanceModelOne();
//		testThreadSafeSingleInstanceModelTwo();
//		testThreadSafeSingleInstanceModelThree();
//		testThreadSafeSingleInstanceModelFour();
		testThreadSafeSingleInstanceModelFiveThread();
		testEnumSingle();
	}

	private static void testSluggardSingleInstanceThread(){
		TestThreads.SimpleSluggardSingleInstanceThread[] threads = new TestThreads.SimpleSluggardSingleInstanceThread[len];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = TestThreads.getThreadHandler().newSimpleSluggardSingleInstanceThread();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

	}

	private static void testHungrySingleInstanceThread(){

		TestThreads.SimpleHungrySingleInstanceThread[] threads = new TestThreads.SimpleHungrySingleInstanceThread[len];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = TestThreads.getThreadHandler().newSimpleHungrySingleInstanceThread();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

	}

	private static void testThreadSafeSingleInstanceModelOne(){

		TestThreads.ThreadSafeSingleInstanceModelOneThread[] threads = new TestThreads.ThreadSafeSingleInstanceModelOneThread[len];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = TestThreads.getThreadHandler().newThreadSafeSingleInstanceModelOneThread();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

	}

	private static void testThreadSafeSingleInstanceModelTwo(){

		TestThreads.ThreadSafeSingleInstanceModelTwoThread[] threads = new TestThreads.ThreadSafeSingleInstanceModelTwoThread[len];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = TestThreads.getThreadHandler().newThreadSafeSingleInstanceModelTwoThread();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

	}

	private static void testThreadSafeSingleInstanceModelThree(){

		TestThreads.ThreadSafeSingleInstanceModelThreeThread[] threads = new TestThreads.ThreadSafeSingleInstanceModelThreeThread[len];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = TestThreads.getThreadHandler().newThreadSafeSingleInstanceModelThreeThread();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

	}


		private static void testThreadSafeSingleInstanceModelFour(){

		TestThreads.ThreadSafeSingleInstanceModelFourThread[] threads = new TestThreads.ThreadSafeSingleInstanceModelFourThread[len];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = TestThreads.getThreadHandler().newThreadSafeSingleInstanceModelThreeFour();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

	}

	private static void testThreadSafeSingleInstanceModelFiveThread(){

		TestThreads.ThreadSafeSingleInstanceModelFiveThread[] threads = new TestThreads.ThreadSafeSingleInstanceModelFiveThread[len];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = TestThreads.getThreadHandler().newThreadSafeSingleInstanceModelFiveThread();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

	}

	private static void testEnumSingle(){
		Thread[] threads = new Thread[len];

		for (int i = 0; i < len; i++) {
			threads[i] = new Thread(){
				@Override
				public void run() {
					Cat instance = ThreadSafeSingleInstanceFactoryFive.getCat();
					System.out.println(instance.hashCode());
				}
			};
		}

		for (int i = 0; i < len; i++) {
			threads[i].start();
		}

	}



}
