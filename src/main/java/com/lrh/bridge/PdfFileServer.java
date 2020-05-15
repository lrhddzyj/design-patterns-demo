package com.lrh.bridge;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 15:35
 */
public class PdfFileServer extends FileServer {

	public PdfFileServer(Sender fileSender) {
		super(fileSender);
	}

	@Override
	public void sendFile(File file) {
		System.out.println("PDF文件服务器发送文件");
		System.out.println("文件类型: " + file.getFileType());
		super.fileSender.send(file);
	}
}
