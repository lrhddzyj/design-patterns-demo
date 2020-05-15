package com.lrh.bridge;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 15:28
 */
public class PdfSender implements Sender {

	@Override
	public void send(File file) {
		if (!(file instanceof PdfFile)) {
			throw new RuntimeException("不支持的文件类型");
		}
		System.out.println("发送文件: " + file.getFileName());
	}
}
