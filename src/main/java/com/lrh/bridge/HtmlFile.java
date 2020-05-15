package com.lrh.bridge;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 15:27
 */
public class HtmlFile implements File {

	private String htmlContent;

	private String fileName;

	public HtmlFile(String htmlContent, String fileName) {
		this.htmlContent = htmlContent;
		this.fileName = fileName;
	}

	@Override
	public String getFileType() {
		return "HTML";
	}

	@Override
	public String getFileName() {
		return fileName;
	}

	@Override
	public String getFileContent() {
		return htmlContent;
	}



}
