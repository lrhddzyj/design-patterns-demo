package com.lrh.factory.method;

import com.lrh.factory.simple.FileParser;
import com.lrh.factory.simple.RuleConfigSource;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:58
 */
public class Client {

	public static void main(String[] args) {
		String filePath = "/User/application.json";
		com.lrh.factory.simple.RuleConfigSource ruleConfigSource = new RuleConfigSource();
		FileParser.RuleConfig ruleConfig = ruleConfigSource.load(filePath);
	}
}
