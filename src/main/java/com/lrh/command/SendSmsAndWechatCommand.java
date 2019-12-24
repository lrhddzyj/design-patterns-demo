package com.lrh.command;

public class SendSmsAndWechatCommand extends AbstractCommand {

	private String phone;

	private String openId;

	private String msgContent;

	public SendSmsAndWechatCommand(String phone, String openId, String msgContent) {
		this.phone = phone;
		this.openId = openId;
		this.msgContent = msgContent;
	}

	@Override
	public void execute() {
		smsReceiver.sendMsg(this.phone, this.msgContent);
		wechatReceiver.sendMsg(this.openId, this.msgContent);
	}
}
