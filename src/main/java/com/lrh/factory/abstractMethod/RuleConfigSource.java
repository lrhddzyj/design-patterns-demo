package com.lrh.factory.abstractMethod;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 11:04
 */
public class RuleConfigSource {

	public RuleConfig load(String filePath) {
		String fileExtension = this.getFileExtension(filePath);
		ConfigParserFactory configParserFactory = this.getConfigParserFactory(fileExtension);
		RuleFileParser fileParser = configParserFactory.createRuleParser();
		String fileContent = getFileContent(filePath);
		RuleConfig ruleConfig = fileParser.parser();
		return ruleConfig;
	}

	private ConfigParserFactory getConfigParserFactory(String fileType) {
		ConfigParserFactory configParserFactory = null;
		if ("json".equals(fileType)) {
			configParserFactory = new JsonConfigParserFactory();
		}
		if ("xml".equals(fileType)) {
			configParserFactory = new XmlConfigParserFactory();
		}
		if ("properties".equals(fileType)) {
			configParserFactory = new PropertiesConfigParserFactory();
		}
		return configParserFactory;
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
