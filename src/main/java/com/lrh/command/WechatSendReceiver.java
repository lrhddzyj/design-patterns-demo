package com.lrh.command;

public class WechatSendReceiver {

	public void sendMsg(String openId,String msgContent) {
		System.out.println("向用户openId [" + openId + "] 发送微信消息：" + msgContent);
	}
}
