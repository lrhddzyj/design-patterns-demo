package com.lrh.bridge.notify;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 15:40
 */
public class SmsSend implements MessageSend {
	@Override
	public void send(String msgContent) {
		System.out.println("发送短信");
	}
}
