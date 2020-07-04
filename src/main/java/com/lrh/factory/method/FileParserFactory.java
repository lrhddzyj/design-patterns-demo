package com.lrh.factory.method;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:46
 */
public interface FileParserFactory {

	/**
	 * 创建parser
	 * @return
	 */
	FileParser createParser();

}
