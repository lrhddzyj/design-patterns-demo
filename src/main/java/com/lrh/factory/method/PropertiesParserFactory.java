package com.lrh.factory.method;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:49
 */
public class PropertiesParserFactory implements FileParserFactory {
	@Override
	public FileParser createParser() {
		return new PropertiesParser();
	}
}
