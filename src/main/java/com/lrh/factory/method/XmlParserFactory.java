package com.lrh.factory.method;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:48
 */
public class XmlParserFactory implements FileParserFactory{
	@Override
	public FileParser createParser() {
		return new XmlParser();
	}

}
