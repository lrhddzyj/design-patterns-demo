package com.lrh.factory.method;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:46
 */
public class JsonParserFactory implements FileParserFactory {

	@Override
	public FileParser createParser() {
		return new JsonParser();
	}
}
