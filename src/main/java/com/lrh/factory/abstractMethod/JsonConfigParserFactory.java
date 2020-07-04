package com.lrh.factory.abstractMethod;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 12:37
 */
public class JsonConfigParserFactory implements ConfigParserFactory {

	@Override
	public RuleFileParser createRuleParser() {
		return new JsonRuleConfigParser();
	}

	@Override
	public SystemFileParser createSystemParser() {
		return new JsonSystemConfigParser();
	}


}
