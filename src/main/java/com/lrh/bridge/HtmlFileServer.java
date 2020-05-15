package com.lrh.bridge;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 15:35
 */
public class HtmlFileServer extends FileServer {
	public HtmlFileServer(Sender fileSender) {
		super(fileSender);
	}

	@Override
	public void sendFile(File file) {
		System.out.println("HTML文件服务器发送文件");
		System.out.println("文件类型: " + file.getFileType());
		super.fileSender.send(file);
	}
}
