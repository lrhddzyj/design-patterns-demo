package com.lrh.factory.method;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂的工厂
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:50
 */
public class FileParserFactoryMap {

	private static final Map<String, FileParserFactory> fileParserFactoryMap = new HashMap();

	static {
		fileParserFactoryMap.put("json", new JsonParserFactory());
		fileParserFactoryMap.put("xml", new XmlParserFactory());
		fileParserFactoryMap.put("properties", new PropertiesParserFactory());
	}

	public static FileParserFactory getParserFactory(String fileType) {
		return fileParserFactoryMap.get(fileType);
	}


}
