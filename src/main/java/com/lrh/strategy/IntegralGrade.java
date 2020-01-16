package com.lrh.strategy;

import java.util.Arrays;

public enum IntegralGrade {

	LV1(0L,100L),
	LV2(100L,500L),
	LV3(500L,Long.MAX_VALUE);

	private Long minIntegral;

	private Long maxIntegral;

	IntegralGrade(Long minIntegral,Long maxIntegral){
		this.minIntegral = minIntegral;
		this.maxIntegral = maxIntegral;
	}

	public static IntegralGrade get(Long integral){
		return Arrays.stream(IntegralGrade.values())
				.filter(integralGrade -> (integral >= integralGrade.getMinIntegral() && integral < integralGrade.getMaxIntegral()))
				.findFirst().get();
	}

	public Long getMinIntegral() {
		return minIntegral;
	}

	public Long getMaxIntegral() {
		return maxIntegral;
	}
}
