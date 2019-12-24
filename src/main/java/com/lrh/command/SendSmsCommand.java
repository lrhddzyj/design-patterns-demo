package com.lrh.command;

public class SendSmsCommand extends AbstractCommand{

	private String msg;

	private String phone;

	public SendSmsCommand(String phone, String msg) {
		this.phone = phone;
		this.msg = msg;

	}
	@Override
	public void execute() {
		smsReceiver.sendMsg(this.phone, this.msg);
	}


}
