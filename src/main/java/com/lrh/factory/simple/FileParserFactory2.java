package com.lrh.factory.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂的第二种实现
 *    生成的是可以重复使用的对象
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:00
 */
public class FileParserFactory2 {

	private static final Map<String, FileParser> fileParserMap = new HashMap();

	static {
		fileParserMap.put("json", new JsonParser());
		fileParserMap.put("xml", new XmlParser());
		fileParserMap.put("properties", new PropertiesParser());
	}

	public static FileParser getFileParser(String fileTye) {
		return fileParserMap.get(fileTye);
	}

}
