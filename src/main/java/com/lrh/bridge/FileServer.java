package com.lrh.bridge;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 15:33
 */
public abstract class FileServer {

	protected Sender fileSender;

	public FileServer(Sender fileSender) {
		this.fileSender = fileSender;
	}

	public abstract void sendFile(File file);

}
