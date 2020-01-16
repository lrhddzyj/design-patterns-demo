package com.lrh.decorator;

public class Boss {

	public static void main(String[] args) {
		YearSummaryReport yearSummaryReport = new YearSummaryReport();
		Decorator decorator = null;
		//第一次装饰
		decorator = new HighProfitDecorator(yearSummaryReport);
		//第二次装饰（在第一层的基础上装饰 类似洋葱外壳）
		decorator = new CompareWithYearDecorator(decorator);

		decorator.report();
		decorator.reviews("好！");

	}
}
