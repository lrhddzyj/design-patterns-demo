package com.lrh.templateMethod;

public class BCommand extends AbstractCommand {

	@Override
	protected boolean pre() {
		return false;
	}

	@Override
	protected void after() {
		System.out.println("执行了B after()");
	}

	@Override
	protected void run() {
		System.out.println("执行了B run()");
	}
}
