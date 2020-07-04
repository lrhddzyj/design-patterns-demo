package com.lrh.factory.simple;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 10:57
 */
public class XmlParser implements FileParser {


	@Override
	public RuleConfig parser(String fileTxt) {
		return new RuleConfig();
	}

}
