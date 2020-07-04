package com.lrh.factory.simple;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:10
 */
public class Client {

	public static void main(String[] args) {
		String filePath = "/User/application.json";
		RuleConfigSource ruleConfigSource = new RuleConfigSource();
		FileParser.RuleConfig ruleConfig = ruleConfigSource.load(filePath);
	}
}
