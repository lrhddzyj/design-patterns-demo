package com.lrh.decorator;

public class HighProfitDecorator extends Decorator {

	public HighProfitDecorator(Report report) {
		super(report);
	}

	@Override
	public void report() {
		super.report();
		System.out.println("利润 一百万");
		System.out.println("利润增长 20%");
	}
}
