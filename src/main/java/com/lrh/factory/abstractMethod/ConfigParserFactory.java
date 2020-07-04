package com.lrh.factory.abstractMethod;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 12:04
 */
public interface ConfigParserFactory {

	RuleFileParser createRuleParser();

	SystemFileParser createSystemParser();
}
