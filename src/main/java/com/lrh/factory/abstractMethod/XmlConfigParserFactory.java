package com.lrh.factory.abstractMethod;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 12:37
 */
public class XmlConfigParserFactory implements ConfigParserFactory {

	@Override
	public RuleFileParser createRuleParser() {
		return new XmlRuleConfigParser();
	}

	@Override
	public SystemFileParser createSystemParser() {
		return new XmlSystemConfigParser();
	}


}
