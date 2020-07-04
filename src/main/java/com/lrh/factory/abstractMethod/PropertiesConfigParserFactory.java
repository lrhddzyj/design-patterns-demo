package com.lrh.factory.abstractMethod;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 12:37
 */
public class PropertiesConfigParserFactory implements ConfigParserFactory {

	@Override
	public RuleFileParser createRuleParser() {
		return new PropertiesRuleConfigParser();
	}

	@Override
	public SystemFileParser createSystemParser() {
		return new PropertiesSystemConfigParser();
	}


}
