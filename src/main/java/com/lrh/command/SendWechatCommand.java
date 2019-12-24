package com.lrh.command;

public class SendWechatCommand extends AbstractCommand {

	private String openId;

	private String msgContent;

	public SendWechatCommand(String openId,String msgContent){
		this.openId = openId;
		this.msgContent = msgContent;
	}

	@Override
	public void execute() {
		wechatReceiver.sendMsg(this.openId, this.msgContent);
	}
}
