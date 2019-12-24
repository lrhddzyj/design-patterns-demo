package com.lrh.command;

public abstract  class AbstractCommand {

	protected static final SmsSendReceiver smsReceiver = new SmsSendReceiver();

	protected static final WechatSendReceiver wechatReceiver = new WechatSendReceiver();

	public abstract void execute();

}
