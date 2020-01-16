package com.lrh.strategy;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IntegralInfo {

	//积分额
	private long amount;

	//会员Id
	private String memberId;


}
