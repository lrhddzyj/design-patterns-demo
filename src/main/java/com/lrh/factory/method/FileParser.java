package com.lrh.factory.method;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 10:57
 */
public interface FileParser {

	/**
	 * 解析对应文本
	 * @param fileTxt
	 * @return
	 */
	RuleConfig parser(String fileTxt);

	/**
	 * 规则配置
	 * @description:
	 * @author: lrh
	 * @date: 2020/7/4 10:56
	 */
	 class RuleConfig {

	}


}
