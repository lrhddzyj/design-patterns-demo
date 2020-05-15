package com.lrh.bridge;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 15:26
 */
public class TextFile implements File {

	private String text;

	private String fileName;


	public TextFile(String text, String fileName) {
		this.text = text;
		this.fileName = fileName;
	}

	@Override
	public String getFileType() {
		return "TEXT";
	}

	@Override
	public String getFileName() {
		return fileName;
	}

	@Override
	public String getFileContent() {
		return text;
	}
}
