package com.lrh.factory.simple;

/**
 * 简单工厂的第一种实现
 *    每次都新生成一个对象
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:00
 */
public class FileParserFactory {

	public static FileParser getFileParser(String fileTye) {
		FileParser fileParser = null;
		if ("json".equals(fileTye)) {
			fileParser =  new JsonParser();
		}
		if ("xml".equals(fileTye)) {
			fileParser =  new XmlParser();
		}
		if ("properties".equals(fileTye)) {
			fileParser =  new PropertiesParser();
		}
		return fileParser;
	}

}
