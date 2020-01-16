package com.lrh.strategy;

import java.util.HashMap;
import java.util.Map;

public class Context {

	private static final Map<String, Strategy> strategyMap = new HashMap();

	public static void addStrategy(String strategyKey, Strategy strategy) {
		strategyMap.put(strategyKey, strategy);
	}

	public Strategy getStrategy(Long integral) {
		IntegralGrade integralGrade = IntegralGrade.get(integral);
		return strategyMap.get(integralGrade.name());
	}

}
