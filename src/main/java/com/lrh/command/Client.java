package com.lrh.command;

public class Client {

	public static void main(String[] args) {
		String phone = "1889999999";
		String openId = "ox-2suskgwxs7wqe8232";
		String msgContent = "您有一份礼品待领取";

		Invoker invoker = new Invoker();

		//1,发出发送短信的命令
		AbstractCommand smsCommand = new SendSmsCommand(phone, msgContent);
		invoker.setCommand(smsCommand);
		invoker.action();

		//2,发给微信消息的命令
		AbstractCommand wechatCommand = new SendWechatCommand(openId, msgContent);
		invoker.setCommand(wechatCommand);
		invoker.action();


		//3,发送短信和微信消息的命令
		AbstractCommand smsAndWechatCommand = new SendSmsAndWechatCommand(phone, openId, msgContent);
		invoker.setCommand(smsAndWechatCommand);
		invoker.action();

	}
}
