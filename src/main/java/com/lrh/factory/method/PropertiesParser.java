package com.lrh.factory.method;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:02
 */
public class PropertiesParser implements FileParser {
	@Override
	public RuleConfig parser(String fileTxt) {
		return new RuleConfig();
	}
}
