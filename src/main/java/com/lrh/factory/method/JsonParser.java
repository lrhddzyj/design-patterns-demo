package com.lrh.factory.method;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 10:53
 */
public class JsonParser implements FileParser {

	@Override
	public RuleConfig parser(String jsonTxt) {

		return new RuleConfig();
	}


}
