package com.lrh.decorator;

public class CompareWithYearDecorator extends Decorator {

	public CompareWithYearDecorator(Report report) {
		super(report);
	}

	@Override
	public void report() {
		super.report();
		System.out.println("比去年增加了一百万的销售额");
		System.out.println("增长达到10%");
	}
}
