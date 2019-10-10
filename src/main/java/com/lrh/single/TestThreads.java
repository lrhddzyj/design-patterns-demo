package com.lrh.single;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestThreads {

	private static final TestThreads threadHandle = new TestThreads();

	public static TestThreads getThreadHandler(){
		return threadHandle;
	}

	public class SimpleHungrySingleInstanceThread extends Thread{
		@Override
		public void run() {
			log.info("Thread getInstance hashCode = {}", SimpleHungrySingleInstance.getSingleInstance().hashCode());
		}
	}

	public  SimpleHungrySingleInstanceThread newSimpleHungrySingleInstanceThread(){
		return new SimpleHungrySingleInstanceThread();
	}


	public class SimpleSluggardSingleInstanceThread extends Thread{
		@Override
		public void run() {
			log.info("Thread getInstance hashCode = {}", SimpleSluggardSingleInstance.getInstance().hashCode());
		}
	}

	public  SimpleSluggardSingleInstanceThread newSimpleSluggardSingleInstanceThread(){
		return new SimpleSluggardSingleInstanceThread();
	}

	public class ThreadSafeSingleInstanceModelOneThread extends Thread{
		@Override
		public void run() {
			log.info("Thread getInstance hashCode = {}", ThreadSafeSingleInstanceModelOne.getInstance().hashCode());
		}
	}

	public ThreadSafeSingleInstanceModelOneThread newThreadSafeSingleInstanceModelOneThread(){
		return new ThreadSafeSingleInstanceModelOneThread();
	}

	public class ThreadSafeSingleInstanceModelTwoThread extends Thread{
		@Override
		public void run() {
			log.info("Thread getInstance hashCode = {}", ThreadSafeSingleInstanceModelTwo.getInstance().hashCode());
		}
	}

	public ThreadSafeSingleInstanceModelTwoThread newThreadSafeSingleInstanceModelTwoThread(){
		return new ThreadSafeSingleInstanceModelTwoThread();
	}

	public class ThreadSafeSingleInstanceModelThreeThread extends Thread{
		@Override
		public void run() {
			log.info("Thread getInstance hashCode = {}", ThreadSafeSingleInstanceModelThree.getInstance().hashCode());
		}
	}

	public ThreadSafeSingleInstanceModelThreeThread newThreadSafeSingleInstanceModelThreeThread(){
		return new ThreadSafeSingleInstanceModelThreeThread();
	}

	public class ThreadSafeSingleInstanceModelFourThread extends Thread{
		@Override
		public void run() {
			log.info("Thread getInstance hashCode = {}", ThreadSafeSingleInstanceModelFour.getInstance().hashCode());
		}
	}

	public ThreadSafeSingleInstanceModelFourThread newThreadSafeSingleInstanceModelThreeFour(){
		return new ThreadSafeSingleInstanceModelFourThread();
	}

	public class ThreadSafeSingleInstanceModelFiveThread extends Thread{
		@Override
		public void run() {
			ThreadSafeSingleInstanceFactoryFive.doSomeThing();
//			log.info("Thread getInstanse hashCode = {}", ThreadSafeSingleInstanceFactoryFive.getInstance().doSomeThing());
		}
	}

	public ThreadSafeSingleInstanceModelFiveThread newThreadSafeSingleInstanceModelFiveThread(){
		return new ThreadSafeSingleInstanceModelFiveThread();
	}



}
