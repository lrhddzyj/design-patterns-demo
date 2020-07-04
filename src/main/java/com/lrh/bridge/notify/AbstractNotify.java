package com.lrh.bridge.notify;

/**
 * @description:
 * @author: lrh
 * @date: 2020/7/4 15:33
 */
public abstract class AbstractNotify implements Notify {

	private MessageSend messageSend;

	private MessageFormat messageFormat;

	protected String eventLevel;

	public AbstractNotify(MessageSend messageSend, MessageFormat messageFormat) {
		this.messageSend = messageSend;
		this.messageFormat = messageFormat;
	}

	@Override
	public void send() {
		String messageFromData = "messageFromData";
		String formatContent = messageFormat.format(messageFromData);
		messageSend.send(formatContent);
	}

	protected abstract void setEventLevel();
}
