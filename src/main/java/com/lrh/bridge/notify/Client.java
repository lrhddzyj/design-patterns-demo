package com.lrh.bridge.notify;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 15:43
 */
public class Client {

	public static void main(String[] args) {
		MessageFormat messageFormat = new JsonFormat();
		MessageSend messageSend = new SmsSend();
		AbstractNotify abstractNotify = new NormalNotify(messageSend, messageFormat);
		abstractNotify.send();
	}

}
