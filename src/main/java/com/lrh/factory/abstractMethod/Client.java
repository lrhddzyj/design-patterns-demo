package com.lrh.factory.abstractMethod;



/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 12:43
 */
public class Client {

	public static void main(String[] args) {
		String filePath = "/User/application.json";
		RuleConfigSource ruleConfigSource = new RuleConfigSource();
		RuleConfig ruleConfig = ruleConfigSource.load(filePath);

	}
}
