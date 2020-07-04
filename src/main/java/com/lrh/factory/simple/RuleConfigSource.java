package com.lrh.factory.simple;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:04
 */
public class RuleConfigSource {

	public FileParser.RuleConfig load(String filePath) {
		String fileExtension = this.getFileExtension(filePath);
		FileParser fileParser = FileParserFactory.getFileParser(fileExtension);
		String fileContent = getFileContent(filePath);
		FileParser.RuleConfig ruleConfig = fileParser.parser(fileContent);
		return ruleConfig;
	}

	private String getFileContent(String filePath) {
		//文件内容
		String fileContent = "";
		// 读取文件内容。。。。。
		return fileContent;
	}


	private String getFileExtension(String filePath) {
		String fileExtension = "";
		// 解析文件路径 返回文件名后缀
		return fileExtension;
	}
}
