package com.lrh.decorator;

public  abstract   class Decorator implements Report  {

	private Report report;

	public Decorator(Report report) {
		this.report = report;
	}

	@Override
	public void report() {
		this.report.report();
	}

	@Override
	public void reviews(String reviewsResult) {
		this.report.reviews(reviewsResult);
	}
}
