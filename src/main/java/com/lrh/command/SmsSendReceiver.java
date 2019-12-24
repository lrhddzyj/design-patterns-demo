package com.lrh.command;

public class SmsSendReceiver  {

	public void sendMsg(String phone, String msgContent) {
		System.out.println("向手机号码 ["+ phone+" ] 发送短信消息:" + msgContent);
	}
}
