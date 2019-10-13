package com.lrh.templateMethod;

public class ACommand extends AbstractCommand {

	@Override
	protected boolean pre() {
		return true;
	}

	@Override
	protected void after() {
		System.out.println("执行了A after()");

	}

	@Override
	protected void run() {
		System.out.println("执行了A run()");
	}
}
