package com.lrh.decorator;

public class YearSummaryReport implements Report {

	@Override
	public void report() {
		System.out.println("今年销售额 一千万");
	}

	@Override
	public void reviews(String reviewsResult) {
		System.out.println("报告点评: " + reviewsResult);
	}
}
