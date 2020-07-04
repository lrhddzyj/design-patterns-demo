package com.lrh.bridge.notify;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 15:41
 */
public class WechatSend implements MessageSend {
	@Override
	public void send(String msgContent) {
		System.out.println("发送微信消息");
	}

}
